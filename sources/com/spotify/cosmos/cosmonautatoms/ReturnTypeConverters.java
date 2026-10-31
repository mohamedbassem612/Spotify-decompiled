package com.spotify.cosmos.cosmonautatoms;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverters;", "Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverter;", "", "<init>", "(Ljava/lang/String;I)V", "OBSERVABLE", "SINGLE", "COMPLETABLE", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public enum ReturnTypeConverters implements ReturnTypeConverter {
    OBSERVABLE { // from class: com.spotify.cosmos.cosmonautatoms.ReturnTypeConverters.OBSERVABLE
        @Override // com.spotify.cosmos.cosmonautatoms.ReturnTypeConverter
        public Object convert(ResponseTransformer converter, Observable<Response> source) {
            return source.compose(converter);
        }

        @Override // com.spotify.cosmos.cosmonautatoms.ReturnTypeConverter
        public boolean isSupported(Type returnType, String action) {
            Companion companion = ReturnTypeConverters.INSTANCE;
            return companion.isSub(action) && companion.isGenericTypeOf(returnType, Observable.class);
        }
    },
    SINGLE { // from class: com.spotify.cosmos.cosmonautatoms.ReturnTypeConverters.SINGLE
        @Override // com.spotify.cosmos.cosmonautatoms.ReturnTypeConverter
        public Object convert(ResponseTransformer converter, Observable<Response> source) {
            return source.compose(converter).singleOrError();
        }

        @Override // com.spotify.cosmos.cosmonautatoms.ReturnTypeConverter
        public boolean isSupported(Type returnType, String action) {
            Companion companion = ReturnTypeConverters.INSTANCE;
            return !companion.isSub(action) && companion.isGenericTypeOf(returnType, Single.class);
        }
    },
    COMPLETABLE { // from class: com.spotify.cosmos.cosmonautatoms.ReturnTypeConverters.COMPLETABLE
        @Override // com.spotify.cosmos.cosmonautatoms.ReturnTypeConverter
        public Object convert(ResponseTransformer converter, Observable<Response> source) {
            return source.ignoreElements();
        }

        @Override // com.spotify.cosmos.cosmonautatoms.ReturnTypeConverter
        public boolean isSupported(Type returnType, String action) {
            Companion companion = ReturnTypeConverters.INSTANCE;
            return (companion.isSub(action) || companion.isGet(action) || !returnType.equals(Completable.class)) ? false : true;
        }
    };

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReturnTypeConverters[] VALUES = values();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverters$Companion;", "", "<init>", "()V", "VALUES", "", "Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverters;", "[Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverters;", "find", "Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverter;", "method", "Ljava/lang/reflect/Method;", "isGenericTypeOf", "", "returnType", "Ljava/lang/reflect/Type;", "clazz", "Ljava/lang/Class;", "isSub", "action", "", "isGet", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReturnTypeConverter find(Method method) {
            String strFindAction = ReflectionUtil.INSTANCE.findAction(method);
            Type genericReturnType = method.getGenericReturnType();
            for (ReturnTypeConverters returnTypeConverters : ReturnTypeConverters.VALUES) {
                genericReturnType.getClass();
                if (returnTypeConverters.isSupported(genericReturnType, strFindAction)) {
                    return returnTypeConverters;
                }
            }
            throw new IllegalArgumentException(method.toString() + "'s (action, return type) pair is not supported: " + strFindAction + ", " + genericReturnType);
        }

        public final boolean isGenericTypeOf(Type returnType, Class<?> clazz) {
            return (returnType instanceof ParameterizedType) && ((ParameterizedType) returnType).getRawType().equals(clazz);
        }

        public final boolean isGet(String action) {
            return Request.GET.equals(action);
        }

        public final boolean isSub(String action) {
            return Request.SUB.equals(action);
        }

        private Companion() {
        }
    }

    /* synthetic */ ReturnTypeConverters(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final ReturnTypeConverter find(Method method) {
        return INSTANCE.find(method);
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }
}
