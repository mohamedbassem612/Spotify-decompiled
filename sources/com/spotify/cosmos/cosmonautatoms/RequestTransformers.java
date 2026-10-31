package com.spotify.cosmos.cosmonautatoms;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p.k220;
import p.q7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;", "", "factories", "", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "<init>", "(Ljava/util/List;)V", "getFactories", "()Ljava/util/List;", "converters", "Lcom/spotify/cosmos/cosmonaut/Converter;", "", "find", "type", "Ljava/lang/reflect/Type;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class RequestTransformers {
    private final List<Converter<?, byte[]>> converters;
    private final List<Converter.Factory> factories;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestTransformers(List<? extends Converter.Factory> list) {
        this.factories = list;
        List<? extends Converter.Factory> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Converter.Factory) it.next()).createRequestConverter());
        }
        this.converters = arrayList;
    }

    public final Converter<?, byte[]> find(Type type) {
        for (Converter<?, byte[]> converter : this.converters) {
            if (converter.canHandle(type)) {
                return converter;
            }
        }
        k220.g(type, " is not supported by RequestTransformers");
        return null;
    }

    public final List<Converter.Factory> getFactories() {
        return this.factories;
    }
}
