package p;

import com.spotify.extendedmetadata.extensions.audioattributesv2impl.proto.AudioAttributesV2Proto;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class so7 implements ov00 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ez00 a(byte[] bArr) throws NoWhenBranchMatchedException {
        AudioAttributesV2Proto.AudioAttributes audioAttributesP = AudioAttributesV2Proto.AudioAttributes.p(bArr);
        double dN = audioAttributesP.n();
        String key = audioAttributesP.o().getKey();
        int iOrdinal = audioAttributesP.o().p().ordinal();
        int i = 3;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 2;
            } else if (iOrdinal == 2) {
                i = 1;
            } else if (iOrdinal != 3) {
                eg.o();
                return null;
            }
        }
        AudioAttributesV2Proto.AudioAttributes.Key.CamelotKey camelotKeyN = audioAttributesP.o().n();
        return new ro7(dN, key, i, new qo7(camelotKeyN.getValue(), camelotKeyN.n()));
    }

    public final int b() {
        return 222;
    }

    public final Class type() {
        return ro7.class;
    }
}
