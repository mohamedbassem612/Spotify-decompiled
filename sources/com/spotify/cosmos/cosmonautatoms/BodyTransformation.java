package com.spotify.cosmos.cosmonautatoms;

import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.Converter;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import p.wu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R \u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/spotify/cosmos/cosmonautatoms/BodyTransformation;", "Lp/wu30;", "", "", "", "", "index", "Ljava/lang/reflect/Type;", "type", "Lcom/spotify/cosmos/cosmonaut/Converter;", "converter", "<init>", "(ILjava/lang/reflect/Type;Lcom/spotify/cosmos/cosmonaut/Converter;)V", "args", "apply", "([Ljava/lang/Object;)[B", "I", "Ljava/lang/reflect/Type;", "Lcom/spotify/cosmos/cosmonaut/Converter;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class BodyTransformation implements wu30 {
    private final Converter<?, byte[]> converter;
    private final int index;
    private final Type type;

    public BodyTransformation(int i, Type type, Converter<?, byte[]> converter) {
        this.index = i;
        this.type = type;
        this.converter = converter;
    }

    @Override // p.wu30
    public byte[] apply(Object[] args) {
        try {
            byte[] bArrConvert = this.converter.convert(this.type, args[this.index]);
            if (bArrConvert != null) {
                return bArrConvert;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (IOException e) {
            Logger.e(e, "Unexpected IO exception", new Object[0]);
            return BodyAtom.INSTANCE.getDEFAULT_VALUE$src_main_java_com_spotify_cosmos_cosmonautatoms_cosmonautatoms();
        }
    }
}
