package p;

import com.spotify.mobius.Next;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z691 extends hab0 implements vu30 {
    public static final z691 N0;
    public static final z691 X;
    public static final z691 Y;
    public static final z691 Z;
    public static final z691 b;
    public static final z691 c;
    public static final z691 d;
    public static final z691 e;
    public static final z691 f;
    public static final z691 g;
    public static final z691 h;
    public static final z691 i;
    public static final z691 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new z691(i2, (byte) 0);
        c = new z691(i2, (byte) 1);
        d = new z691(i2, (byte) 2);
        e = new z691(i2, (byte) 3);
        f = new z691(i2, (byte) 4);
        g = new z691(i2, (byte) 5);
        h = new z691(i2, (byte) 6);
        i = new z691(i2, (byte) 7);
        t = new z691(i2, (byte) 8);
        X = new z691(i2, (byte) 9);
        Y = new z691(i2, (byte) 10);
        Z = new z691(i2, (byte) 11);
        N0 = new z691(i2, (byte) 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z691(avl1 avl1Var, byte b2) {
        super(2);
        this.a = b2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        boolean z = false;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return new x691((k791) obj2, ((y691) obj).a());
            case 1:
                return ((ce91) obj).b;
            case 2:
                return ((te91) obj).b;
            case 3:
                return Long.valueOf(((dma1) obj).j((bma1) obj2));
            case 4:
                return ((kdf1) obj).c;
            case 5:
                return null;
            case 6:
                return ((q6j1) obj).c;
            case 7:
                return ((b7j1) obj).b;
            case 8:
                return new n6k1((m6k1) obj, ((Boolean) obj2).booleanValue());
            case 9:
                f6l1 f6l1Var = (f6l1) obj;
                return new g6l1(f6l1Var.e(), d7e.A((k1r) obj2, f6l1Var), f6l1Var.c(), f6l1Var.g(), f6l1Var.a(), f6l1Var.b(), f6l1Var.d());
            case 10:
                return new z7l1((y7l1) obj);
            case 11:
                rzl1 rzl1Var = (rzl1) obj;
                rzl1 rzl1Var2 = (rzl1) obj2;
                if (u890.j(rzl1Var != null ? rzl1Var.a : null, rzl1Var2 != null ? rzl1Var2.a : null)) {
                    if (u890.j(rzl1Var != null ? Boolean.valueOf(rzl1Var.c) : null, rzl1Var2 != null ? Boolean.valueOf(rzl1Var2.c) : null)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                return z6x.a;
            case 13:
                wcm wcmVar = (wcm) obj;
                bdm bdmVar = (bdm) obj2;
                boolean z2 = bdmVar.c;
                if (bdmVar.a) {
                    i2 = 2;
                } else if (bdmVar.b) {
                    String str = wcmVar.a;
                    Set set = s4b1.f;
                    if (uic.g(str, blc0.TRACK) && wcmVar.g && !bdmVar.d) {
                        i2 = 3;
                    }
                }
                return new cdm(wcmVar, i2, z2);
            case 14:
                ke10 ke10Var = (ke10) obj;
                return Next.h(le10.a((le10) obj2, null, null, null, ke10Var.a, null, ke10Var.b, ke10Var.c, ke10Var.d, ke10Var.e, ke10Var.f, null, null, 6191));
            case 15:
                ea10 ea10Var = (ea10) obj2;
                ea10Var.getClass();
                return d3p1.I(ea10Var, (hv70) obj, false, false, false);
            default:
                set0 set0Var = (set0) obj;
                zkm zkmVarA = ((yet0) obj2).a();
                String strC = set0Var.c();
                if (strC == null) {
                    strC = set0Var.b();
                }
                Set set2 = s4b1.f;
                boolean zJ = u890.j((uic.h(strC, new blc0[]{blc0.SHOW_EPISODE, blc0.SHOW_EPISODE_AUTOPLAY, blc0.SHOW_EPISODE_AUTOPLAY_WITH_TIMESTAMP, blc0.SHOW_EPISODE_SCROLL, blc0.SHOW_EPISODE_TIMESTAMP, blc0.EPISODE_AUTOPLAY, blc0.EPISODE_PREVIEW_PLAYER, blc0.EPISODE_PREVIEW_PLAYLIST}) || uic.h(strC, new blc0[]{blc0.TRACK, blc0.TRACK_AUTOPLAY})) ? zkmVarA.b() : zkmVarA.a(), strC);
                if (zkmVarA.c() && zJ) {
                    z = true;
                }
                return new uet0(set0Var.b(), set0Var.d(), z, zJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z691(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}
