package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.Converter;
import com.spotify.cosmos.cosmonaut.TypedResponse;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"com/spotify/cosmos/cosmonautatoms/ResponseTransformers$create$1", "Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformer;", "apply", "Lio/reactivex/rxjava3/core/ObservableSource;", "", "upstream", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ResponseTransformers$create$1 implements ResponseTransformer {
    final /* synthetic */ Converter<byte[], ?> $converter;
    final /* synthetic */ Type $nestedType;

    public ResponseTransformers$create$1(Converter<byte[], ?> converter, Type type) {
        this.$converter = converter;
        this.$nestedType = type;
    }

    public ObservableSource<Object> apply(Observable<Response> upstream) {
        final Converter<byte[], ?> converter = this.$converter;
        final Type type = this.$nestedType;
        return upstream.map(new Function() { // from class: com.spotify.cosmos.cosmonautatoms.ResponseTransformers$create$1$apply$1
            public final Object apply(Response response) {
                int status = response.getStatus();
                String uri = response.getUri();
                if (uri == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                Map headers = response.getHeaders();
                if (headers != null) {
                    return new TypedResponse(status, uri, headers, converter.convert(type, response.getBody()));
                }
                eg.m("Required value was null.");
                return null;
            }
        });
    }
}
