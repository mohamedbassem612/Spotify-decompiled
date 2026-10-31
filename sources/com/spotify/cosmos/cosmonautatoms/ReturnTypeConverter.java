package com.spotify.cosmos.cosmonautatoms;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Observable;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverter;", "", "isSupported", "", "returnType", "Ljava/lang/reflect/Type;", "action", "", "convert", "converter", "Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformer;", "source", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface ReturnTypeConverter {
    Object convert(ResponseTransformer converter, Observable<Response> source);

    boolean isSupported(Type returnType, String action);
}
