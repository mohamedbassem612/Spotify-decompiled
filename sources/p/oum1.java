package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oum1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c1t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oum1(c1t c1tVar, byte b) {
        super(1);
        this.a = b;
        this.b = c1tVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c1t c1tVar = this.b;
        switch (b) {
            case 0:
                return new vlj1(c1tVar.b, (Set) obj, (byte) 20);
            default:
                return new j3r(c1tVar.b.a.getValue());
        }
    }
}
