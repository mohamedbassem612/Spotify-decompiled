package com.spotify.cosmos.cosmonautatoms;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.Converter;
import com.spotify.cosmos.cosmonaut.TypedResponse;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.k220;
import p.ncn0;
import p.q7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0002\b\u00030\n2\u0006\u0010\u0011\u001a\u00020\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0002\b\u00030\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformers;", "", "factories", "", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "<init>", "(Ljava/util/List;)V", "getFactories", "()Ljava/util/List;", "converters", "Lcom/spotify/cosmos/cosmonaut/Converter;", "", "create", "Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformer;", "genericReturnType", "Ljava/lang/reflect/Type;", "findConverter", "typeArgument", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ResponseTransformers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ResponseTransformer PASS_THROUGH = new ResponseTransformer() { // from class: com.spotify.cosmos.cosmonautatoms.ResponseTransformers$Companion$PASS_THROUGH$1
        @Override // com.spotify.cosmos.cosmonautatoms.ResponseTransformer
        public ObservableSource<Object> apply(Observable<Response> upstream) {
            return upstream.map(new Function() { // from class: com.spotify.cosmos.cosmonautatoms.ResponseTransformers$Companion$PASS_THROUGH$1$apply$1
                public final Object apply(Response response) {
                    return response;
                }
            });
        }
    };
    private final List<Converter<byte[], ?>> converters;
    private final List<Converter.Factory> factories;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformers$Companion;", "", "<init>", "()V", "PASS_THROUGH", "Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformer;", "getPASS_THROUGH", "()Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformer;", "isTypedResponse", "", "typeArgument", "Ljava/lang/reflect/Type;", "getActualTypeArgument", "returnType", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Type getActualTypeArgument(Type returnType) {
            if (!(returnType instanceof ParameterizedType)) {
                eg.m("Check failed.");
                return null;
            }
            Type[] actualTypeArguments = ((ParameterizedType) returnType).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                return actualTypeArguments[0];
            }
            eg.m("Check failed.");
            return null;
        }

        public final ResponseTransformer getPASS_THROUGH() {
            return ResponseTransformers.PASS_THROUGH;
        }

        public final boolean isTypedResponse(Type typeArgument) {
            if (!(typeArgument instanceof ParameterizedType)) {
                return false;
            }
            Type rawType = ((ParameterizedType) typeArgument).getRawType();
            return (rawType instanceof Class) && TypedResponse.class.isAssignableFrom((Class) rawType);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResponseTransformers(List<? extends Converter.Factory> list) {
        this.factories = list;
        List<? extends Converter.Factory> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Converter.Factory) it.next()).createResponseConverter());
        }
        this.converters = arrayList;
    }

    public final ResponseTransformer create(Type genericReturnType) {
        if (!(genericReturnType instanceof ParameterizedType)) {
            return PASS_THROUGH;
        }
        Companion companion = INSTANCE;
        final Type actualTypeArgument = companion.getActualTypeArgument(genericReturnType);
        if (Response.class.equals(actualTypeArgument)) {
            return PASS_THROUGH;
        }
        if (companion.isTypedResponse(actualTypeArgument)) {
            Type actualTypeArgument2 = companion.getActualTypeArgument(actualTypeArgument);
            return new create.1(findConverter(actualTypeArgument2), actualTypeArgument2);
        }
        final Converter<byte[], ?> converterFindConverter = findConverter(actualTypeArgument);
        return new ResponseTransformer() { // from class: com.spotify.cosmos.cosmonautatoms.ResponseTransformers.create.2
            @Override // com.spotify.cosmos.cosmonautatoms.ResponseTransformer
            public ObservableSource<Object> apply(Observable<Response> upstream) {
                final Converter<byte[], ?> converter = converterFindConverter;
                final Type type = actualTypeArgument;
                return upstream.map(new Function() { // from class: com.spotify.cosmos.cosmonautatoms.ResponseTransformers$create$2$apply$1
                    public final Object apply(Response response) {
                        Object objConvert = converter.convert(type, response.getBody());
                        Type type2 = type;
                        if (objConvert != null) {
                            return objConvert;
                        }
                        ncn0.j("failed to decode '", response, "' as ", type2);
                        return null;
                    }
                });
            }
        };
    }

    public final Converter<byte[], ?> findConverter(Type typeArgument) {
        for (Converter<byte[], ?> converter : this.converters) {
            if (converter.canHandle(typeArgument)) {
                return converter;
            }
        }
        k220.g(typeArgument, " is not supported by ResponseTransformers");
        return null;
    }

    public final List<Converter.Factory> getFactories() {
        return this.factories;
    }
}
