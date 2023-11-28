package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<Item> getList () {
        setupList setupList = new setupList();
        return setupList.generateItems();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(getApplicationContext(), getList()));



    }

    public void openSwipeView(View view) {
        Intent intent = new Intent(Main.this, Swipe.class);
        startActivity(intent);
    }


}
class setupList {
    public static List<Item> generateItems() {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Pino carrasco (Pinus halepensis)", "https://gardatxo.org/wp-content/uploads/2020/08/Pino-Carrasco-Pinus-halepensis-Mill.-1768-scaled.jpg"));
        items.add(new Item("Encina (Quercus ilex)", "https://www.aliciaazagra.es/uploads/4/5/3/7/4537905/encina-madrid_orig.jpg"));
        items.add(new Item("Alcornoque (Quercus suber)", "https://www.arbolapp.es/imagenes/especies/especie_075_03.jpg"));
        items.add(new Item("Pino piñonero (Pinus pinea)", "https://static.costadelsolmalaga.org/malaga/subidas/imagenes/7/3/arc_306937_g.jpg"));
        items.add(new Item("Pino laricio (Pinus nigra)", "https://upload.wikimedia.org/wikipedia/commons/9/97/Pinus_nigra_%28subsp._nigra%29_sl1.jpg"));
        items.add(new Item("Roble (Quercus robur)", "https://www.navarra.es/mapacultivos/fotos/sp_quercus_robur/image002b.jpg"));
        items.add(new Item("Abeto (Abies alba)", "https://upload.wikimedia.org/wikipedia/commons/8/85/Sapin_lure.jpg"));
        items.add(new Item("Olivo (Olea europaea)", "https://multimedia.elsevier.es/PublicationsMultimediaV1/item/multimedia/13096631:4v25n11-13096631fig01.jpg?idApp=UINPBA00004N"));
        items.add(new Item("Chopo (Populus)", "https://madera-sostenible.com/wp-content/uploads/2018/10/chopo2-980x600.jpg"));
        items.add(new Item("Eucalipto (Eucalyptus globulus)", "https://media.plantamus.com/product/eucalyptus-camaldulensis-eucalipto-colorado-800x800.jpg"));
        items.add(new Item("Castaño (Castanea sativa)", "https://www.arbolappcanarias.es/imagenes/especies/especie_009_01.jpg"));
        items.add(new Item("Abedul (Betula pendula)", "https://i.etsystatic.com/23209409/r/il/4937ad/3735083700/il_570xN.3735083700_c401.jpg"));
        items.add(new Item("Ciprés (Cupressus)", "https://static.wikia.nocookie.net/esharrypotter/images/6/6c/Cipr%C3%A9s.jpg/revision/latest?cb=20180430140452n"));
        items.add(new Item("Sauce (Salix)", "https://www.atlantico.net/asset/thumbnail,1280,720,center,center/media/atlantico/images/2022/03/12/2022031223522016408.jpg"));
        items.add(new Item("Nogal (Juglans regia)", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/20110802Walnussbaum_Plankstadt2.jpg/1200px-20110802Walnussbaum_Plankstadt2.jpg"));
        items.add(new Item("Tilo (Tilia)", "https://theoriginalgarden.com/Argazkiak/Fotos/TILIACORDATATilodehojapequena_1.jpg"));
        items.add(new Item("Haya (Fagus sylvatica)", "https://www.navarra.es/mapacultivos/fotos/sp_fagus_sylvatica/image001b.jpg"));
        items.add(new Item("Alerce (Larix decidua)", "https://inaturalist-open-data.s3.amazonaws.com/photos/8658087/original.jpg"));
        items.add(new Item("Pino silvestre (Pinus sylvestris)", "https://entresemillas.com/1461-medium_default/pino-silvestre-semillas.jpg"));
        items.add(new Item("Tejo (Taxus baccata)", "https://media.istockphoto.com/id/1192128820/es/foto/taxus-baccata-teew-europeo-es-arbusto-de-con%C3%ADfera.jpg?s=612x612&w=0&k=20&c=uKiaV6JGOy1UKdXAb83h-Wu-0Sqa3S_VVNfVVyeN7X0="));
        items.add(new Item("Arce de Montpellier (Acer monpesulanus)", "2wCEAAoGCBUVExcVFRUYGBcZGxocGhoaGh8cHBojGhocHB8fGxsfHysjHxwoHRcaJDUkKCwuMjIyGiE3PDcxOysxMi4BCwsLDw4PHRERHTYoIykyMzYzOTYzMTkzMzMzMTExMzE5MzExMTExMTExMTExMTMxMTExMTExMTExMTExMTExMf"));
        items.add(new Item("Acacia (Acacia)", "https://media.admagazine.com/photos/63bbd545147955e81067b4f6/master/w_1600%2Cc_limit/acacia-cornigera-hormigas.jpg"));
        items.add(new Item("Acebo (Ilex aquifolium)", "https://www.arbolapp.es/imagenes/especies/especie_033_01.jpg"));
        items.add(new Item("Serbal (Sorbus)", "https://elnougarden.com/cdn/shop/products/Sorbus_aucuparia.jpg?v=1615224027"));
        items.add(new Item("Avellano (Corylus avellana)", "https://cdn0.ecologiaverde.com/es/posts/5/6/8/cuidados_del_avellano_865_orig.jpg"));
        items.add(new Item("Almendro (Prunus dulcis)", "https://www.arbolapp.es/imagenes/especies/especie_059_01.jpg"));

        return items;
    }
}