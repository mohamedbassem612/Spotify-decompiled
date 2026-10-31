package com.spotify.cosmos.cosmonautatoms;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.annotations.Header;
import com.spotify.cosmos.cosmonaut.annotations.HeaderMap;
import com.spotify.cosmos.cosmonaut.annotations.Headers;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b7x;
import p.eg;
import p.f4i1;
import p.gvg;
import p.hhg1;
import p.ihc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/HeadersAtom;", "", "method", "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "staticHeaders", "", "", "dynamicHeadersIndex", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Header;", "dynamicHeaderMapsIndex", "Lcom/spotify/cosmos/cosmonaut/annotations/HeaderMap;", "call", "args", "", "([Ljava/lang/Object;)Ljava/util/Map;", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class HeadersAtom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<IndexedAnnotation<HeaderMap>> dynamicHeaderMapsIndex;
    private final List<IndexedAnnotation<Header>> dynamicHeadersIndex;
    private final Map<String, String> staticHeaders;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\b\u001a\u00020\t¨\u0006\u0012"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/HeadersAtom$Companion;", "", "<init>", "()V", "createDynamicHeadersIndex", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Header;", "method", "Ljava/lang/reflect/Method;", "createDynamicHeaderMapsIndex", "Lcom/spotify/cosmos/cosmonaut/annotations/HeaderMap;", "convertHeaderArg", "", "name", "arg", "createHeaders", "", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<IndexedAnnotation<HeaderMap>> createDynamicHeaderMapsIndex(Method method) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            parameterAnnotations.getClass();
            ArrayList arrayList = new ArrayList();
            int length = parameterAnnotations.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                Annotation[] annotationArr = parameterAnnotations[i];
                ReflectionUtil.Companion companion = ReflectionUtil.INSTANCE;
                annotationArr.getClass();
                HeaderMap headerMap = (HeaderMap) companion.findAnnotation(annotationArr, HeaderMap.class);
                IndexedAnnotation indexedAnnotation = headerMap == null ? null : new IndexedAnnotation(headerMap, i2);
                if (indexedAnnotation != null) {
                    arrayList.add(indexedAnnotation);
                }
                i++;
                i2 = i3;
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<IndexedAnnotation<Header>> createDynamicHeadersIndex(Method method) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            parameterAnnotations.getClass();
            ArrayList arrayList = new ArrayList();
            int length = parameterAnnotations.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                Annotation[] annotationArr = parameterAnnotations[i];
                ReflectionUtil.Companion companion = ReflectionUtil.INSTANCE;
                annotationArr.getClass();
                Header header = (Header) companion.findAnnotation(annotationArr, Header.class);
                IndexedAnnotation indexedAnnotation = header == null ? null : new IndexedAnnotation(header, i2);
                if (indexedAnnotation != null) {
                    arrayList.add(indexedAnnotation);
                }
                i++;
                i2 = i3;
            }
            return arrayList;
        }

        public final String convertHeaderArg(String name, Object arg) {
            if (arg instanceof String) {
                return (String) arg;
            }
            if (arg instanceof Number) {
                return ((Number) arg).toString();
            }
            if (arg == null) {
                hhg1.n(f4i1.f("@Header argument ", name, " is null"));
                return null;
            }
            hhg1.n(gvg.h("@Header argument ", name, " has unsupported type: ", arg.getClass().getName()));
            return null;
        }

        public final Map<String, String> createHeaders(Method method) {
            Headers headers = (Headers) method.getAnnotation(Headers.class);
            if (headers == null) {
                return b7x.a;
            }
            String[] strArrValue = headers.value();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : strArrValue) {
                int iV0 = ihc1.v0(str, ':', 0, 6);
                if (iV0 == -1 || iV0 == 0 || iV0 == str.length() - 1) {
                    hhg1.n("\"".concat(str).concat("\" is not in the form \"Name: Value\""));
                    return null;
                }
                String strSubstring = str.substring(0, iV0);
                String string = ihc1.e1(str.substring(iV0 + 1)).toString();
                if (string.length() == 0) {
                    hhg1.n("\"".concat(strSubstring).concat("\" valuer is empty"));
                    return null;
                }
                linkedHashMap.put(strSubstring, string);
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    public HeadersAtom(Method method) {
        Companion companion = INSTANCE;
        this.staticHeaders = companion.createHeaders(method);
        this.dynamicHeadersIndex = companion.createDynamicHeadersIndex(method);
        this.dynamicHeaderMapsIndex = companion.createDynamicHeaderMapsIndex(method);
    }

    public final Map<String, String> call(Object[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.staticHeaders);
        for (IndexedAnnotation<Header> indexedAnnotation : this.dynamicHeadersIndex) {
            if (args == null) {
                eg.m("Required value was null.");
                return null;
            }
            Object obj = args[indexedAnnotation.getIndex()];
            String strValue = ((Header) indexedAnnotation.getAnnot()).value();
            linkedHashMap.put(strValue, INSTANCE.convertHeaderArg(strValue, obj));
        }
        for (IndexedAnnotation<HeaderMap> indexedAnnotation2 : this.dynamicHeaderMapsIndex) {
            if (args == null) {
                eg.m("Required value was null.");
                return null;
            }
            Object obj2 = args[indexedAnnotation2.getIndex()];
            if (obj2 == null) {
                hhg1.n("@HeaderMap argument is null");
                return null;
            }
            if (!(obj2 instanceof Map)) {
                hhg1.n("@HeaderMap argument is not a java.util.Map");
                return null;
            }
            for (Map.Entry entry : ((Map) obj2).entrySet()) {
                String strValueOf = String.valueOf(entry.getKey());
                linkedHashMap.put(strValueOf, INSTANCE.convertHeaderArg(strValueOf, entry.getValue()));
            }
        }
        return linkedHashMap;
    }
}
