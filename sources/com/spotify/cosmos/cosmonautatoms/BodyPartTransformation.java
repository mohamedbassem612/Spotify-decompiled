package com.spotify.cosmos.cosmonautatoms;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmonaut.Converter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p.sqg0;
import p.wu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/BodyPartTransformation;", "Lp/wu30;", "", "", "", "", "Lcom/spotify/cosmos/cosmonautatoms/PartArgument;", "partArguments", "Lcom/spotify/cosmos/cosmonaut/Converter;", "converter", "<init>", "(Ljava/util/List;Lcom/spotify/cosmos/cosmonaut/Converter;)V", "args", "apply", "([Ljava/lang/Object;)[B", "Ljava/util/List;", "Lcom/spotify/cosmos/cosmonaut/Converter;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class BodyPartTransformation implements wu30 {
    private final Converter<?, byte[]> converter;
    private final List<PartArgument> partArguments;

    public BodyPartTransformation(List<PartArgument> list, Converter<?, byte[]> converter) {
        this.partArguments = list;
        this.converter = converter;
    }

    public byte[] apply(Object[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<PartArgument> it = this.partArguments.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().visit(args));
        }
        try {
            Object objConvert = this.converter.convert(Map.class, sqg0.U(linkedHashMap));
            if (objConvert != null) {
                return (byte[]) objConvert;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (IOException e) {
            Logger.e(e, "Unexpected IO exception", new Object[0]);
            return BodyAtom.Companion.getDEFAULT_VALUE$src_main_java_com_spotify_cosmos_cosmonautatoms_cosmonautatoms();
        }
    }
}
