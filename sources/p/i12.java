package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.address.endpoint.model.v1.proto.GetAddressFieldsRequest;
import com.spotify.address.endpoint.model.v1.proto.GetAddressFieldsResponse;
import com.spotify.address.endpoint.model.v1.proto.GetFormRequest;
import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;
import com.spotify.address.endpoint.model.v1.proto.SearchAddressesRequest;
import com.spotify.address.endpoint.model.v1.proto.SearchAddressesResponse;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormRequest;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/i12;", "", "Lcom/spotify/address/endpoint/model/v1/proto/GetFormRequest;", "body", "Lcom/spotify/address/endpoint/model/v1/proto/GetFormResponse;", "a", "(Lcom/spotify/address/endpoint/model/v1/proto/GetFormRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/address/endpoint/model/v1/proto/SubmitFormRequest;", "Lcom/spotify/address/endpoint/model/v1/proto/SubmitFormResponse;", "c", "(Lcom/spotify/address/endpoint/model/v1/proto/SubmitFormRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/address/endpoint/model/v1/proto/SearchAddressesRequest;", "Lcom/spotify/address/endpoint/model/v1/proto/SearchAddressesResponse;", "d", "(Lcom/spotify/address/endpoint/model/v1/proto/SearchAddressesRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/address/endpoint/model/v1/proto/GetAddressFieldsRequest;", "Lcom/spotify/address/endpoint/model/v1/proto/GetAddressFieldsResponse;", "b", "(Lcom/spotify/address/endpoint/model/v1/proto/GetAddressFieldsRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_address_endpoint-endpoint"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public interface i12 {
    @u360({"Accept: application/protobuf"})
    @wyq0("commerce-address-collection-service/spotify.addresscollection.v1.AddressCollectionService/GetForm")
    Object a(@elb GetFormRequest getFormRequest, lnm<? super GetFormResponse> lnmVar);

    @u360({"Accept: application/protobuf"})
    @wyq0("commerce-address-collection-service/spotify.addresscollection.v1.AddressCollectionService/GetAddressFields")
    Object b(@elb GetAddressFieldsRequest getAddressFieldsRequest, lnm<? super GetAddressFieldsResponse> lnmVar);

    @u360({"Accept: application/protobuf"})
    @wyq0("commerce-address-collection-service/spotify.addresscollection.v1.AddressCollectionService/SubmitForm")
    Object c(@elb SubmitFormRequest submitFormRequest, lnm<? super SubmitFormResponse> lnmVar);

    @u360({"Accept: application/protobuf"})
    @wyq0("commerce-address-collection-service/spotify.addresscollection.v1.AddressCollectionService/SearchAddresses")
    Object d(@elb SearchAddressesRequest searchAddressesRequest, lnm<? super SearchAddressesResponse> lnmVar);
}
