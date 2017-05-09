package com.cunoraz.eksiseyler.domain.search;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Created by cuneytcarikci on 08/05/2017.
 */

public interface SearchUseCase {


    Call<ResponseBody> getSearchResultList(String query);

}
