package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ea71 extends hab0 implements vu30 {
    public static final ea71 N0;
    public static final ea71 O0;
    public static final ea71 P0;
    public static final ea71 Q0;
    public static final ea71 R0;
    public static final ea71 S0;
    public static final ea71 T0;
    public static final ea71 U0;
    public static final ea71 V0;
    public static final ea71 W0;
    public static final ea71 X;
    public static final ea71 X0;
    public static final ea71 Y;
    public static final ea71 Y0;
    public static final ea71 Z;
    public static final ea71 Z0;
    public static final ea71 a1;
    public static final ea71 b;
    public static final ea71 b1;
    public static final ea71 c;
    public static final ea71 c1;
    public static final ea71 d;
    public static final ea71 d1;
    public static final ea71 e;
    public static final ea71 e1;
    public static final ea71 f;
    public static final ea71 g;
    public static final ea71 h;
    public static final ea71 i;
    public static final ea71 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ea71(i2, (byte) 0);
        c = new ea71(i2, (byte) 1);
        d = new ea71(i2, (byte) 2);
        e = new ea71(i2, (byte) 3);
        f = new ea71(i2, (byte) 4);
        g = new ea71(i2, (byte) 5);
        h = new ea71(i2, (byte) 6);
        i = new ea71(i2, (byte) 7);
        t = new ea71(i2, (byte) 8);
        X = new ea71(i2, (byte) 9);
        Y = new ea71(i2, (byte) 10);
        Z = new ea71(i2, (byte) 11);
        N0 = new ea71(i2, (byte) 12);
        O0 = new ea71(i2, (byte) 13);
        P0 = new ea71(i2, (byte) 14);
        Q0 = new ea71(i2, (byte) 15);
        R0 = new ea71(i2, (byte) 16);
        S0 = new ea71(i2, (byte) 17);
        T0 = new ea71(i2, (byte) 18);
        U0 = new ea71(i2, (byte) 19);
        V0 = new ea71(i2, (byte) 20);
        W0 = new ea71(i2, (byte) 21);
        X0 = new ea71(i2, (byte) 22);
        Y0 = new ea71(i2, (byte) 23);
        Z0 = new ea71(i2, (byte) 24);
        a1 = new ea71(i2, (byte) 25);
        b1 = new ea71(i2, (byte) 26);
        c1 = new ea71(i2, (byte) 27);
        d1 = new ea71(i2, (byte) 28);
        e1 = new ea71(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea71(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[LOOP:0: B:28:0x008f->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:90:0x025c  */
    /* JADX WARN: Code duplicated, block: B:91:0x025e  */
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        long j;
        u581 u581Var;
        k581 k581Var;
        byte b2 = this.a;
        int i3 = 2;
        rih1 rih1Var = rih1.a;
        Object obj3 = null;
        switch (b2) {
            case 0:
                return First.b((aa71) obj2);
            case 1:
                return Next.j();
            case 2:
                zg71 zg71Var = (zg71) obj2;
                zg71Var.getClass();
                wa71 wa71Var = zg71Var.b.a;
                Logger.b("[ShareMenu] Share menu opened for entityUri=%s", new Object[]{wa71Var != null ? wa71Var.a : null});
                return First.c(zg71.a(zg71Var, null, null, null, se71.a, null, null, null, null, 499), Collections.singleton(lh71.c));
            case 3:
                ((Number) obj).intValue();
                return ((zh71) ((yq60) obj2).b).f.a;
            case 4:
                Object objT = jhc1.t((Bundle) obj, "parcelable", ii71.class);
                objT.getClass();
                return (Parcelable) objT;
            case 5:
                Object objT2 = jhc1.t((Bundle) obj, "parcelable", wi71.class);
                objT2.getClass();
                return (Parcelable) objT2;
            case 6:
                return Next.h(b2p1.w((qk71) obj2, (kk71) obj));
            case 7:
                return First.c(b2p1.w((qk71) obj2, (kk71) obj), Collections.singleton(uj71.c));
            case 8:
                return null;
            case 9:
                return Collections.singletonList(Integer.valueOf(((dl71) obj2).a.s()));
            case 10:
                ((Number) obj).intValue();
                float f2 = ((p3v) obj2).a;
                return rih1Var;
            case 11:
                ((Number) obj).intValue();
                return rih1Var;
            case 12:
                ((Number) obj).intValue();
                return rih1Var;
            case 13:
                ((Number) obj).intValue();
                return rih1Var;
            case 14:
                aq71 aq71Var = (aq71) obj;
                cq71 cq71Var = (cq71) obj2;
                return new bq71(aq71Var.a, aq71Var.c, aq71Var.b, cq71Var.a, cq71Var.b, aq71Var.e);
            case 15:
                Bundle bundle = (Bundle) obj;
                String string = bundle.getString("shareUri");
                if (string == null) {
                    string = "";
                }
                String str = string;
                String string2 = bundle.getString("previewId");
                String string3 = bundle.getString("senderName");
                jb71 jb71Var = (bc71) jhc1.t(bundle, "shareableMetadata", bc71.class);
                if (jb71Var == null) {
                    jb71Var = jb71.a;
                }
                jb71 jb71Var2 = jb71Var;
                String string4 = bundle.getString("borderStrokeColor");
                if (string4 == null) {
                    i2 = 1;
                } else {
                    if (string4 != null) {
                        if (string4.equals("DEFAULT")) {
                            i3 = 1;
                        } else if (!string4.equals("BRIGHT")) {
                            hhg1.n("No enum constant com.spotify.campfire.elements.shareablecard.api.ShareableCardElement.BorderStrokeColor.".concat(string4));
                        }
                        if (i3 == 0) {
                            i2 = 1;
                        } else {
                            i2 = i3;
                        }
                    } else {
                        bhn0.i("Name is null");
                    }
                    i3 = 0;
                    if (i3 == 0) {
                        i2 = 1;
                    } else {
                        i2 = i3;
                    }
                }
                return new bq71(str, string2, string3, jb71Var2, bundle.getBoolean("explicitContentFiltered", false), i2);
            case 16:
                return Next.h(xr71.a((xr71) obj2, null, ((tr71) obj).a, 1));
            case 17:
                return First.b(xr71.a((xr71) obj2, null, ((tr71) obj).a, 1));
            case 18:
                ur71 ur71Var = ((xr71) obj2).a;
                if (!(ur71Var instanceof ur71)) {
                    return null;
                }
                sr71 sr71Var = ur71Var.a;
                String str2 = sr71Var.a;
                ArrayList arrayList = sr71Var.b;
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-chat-sharedby-chip";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str2;
                y6h1 y6h1VarA = x6h1VarI.a();
                if (arrayList.size() != 1) {
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("shared_by_multiple", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).b = r6h1.c;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var.a();
                }
                String str3 = ((qr71) o7h.q0(arrayList)).b;
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("shared_by_single", (String) null, (Integer) null, str3, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA3 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA3;
                ((xjn) k7h1Var2).b = r6h1.c;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 19:
                return new u7h(u7h.j);
            case 20:
                return new u7h(((afx) obj).c.b);
            case 21:
                yxx yxxVar = ((afx) obj).b;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    j = yxxVar.a;
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    j = yxxVar.b;
                }
                return new u7h(j);
            case 22:
                e381 e381Var = (e381) obj;
                return new f381(e381Var.a, e381Var.b, e381Var.c, e381Var.d, e381Var.e, e381Var.f, e381Var.g, true, ((q910) obj2).a, e381Var.k);
            case 23:
                return null;
            case 24:
                return null;
            case 25:
                t681 t681Var = (t681) obj2;
                List listA = t681Var.a();
                if ((listA instanceof Collection) && listA.isEmpty()) {
                    for (Object obj4 : t681Var.a()) {
                        if (((k581) obj4).e == 3) {
                            obj3 = obj4;
                            k581Var = (k581) obj3;
                            if (k581Var != null) {
                                u581Var = new u581(k581Var.a);
                            } else {
                                u581Var = v581.a;
                            }
                        }
                    }
                    k581Var = (k581) obj3;
                    if (k581Var != null) {
                        u581Var = new u581(k581Var.a);
                    } else {
                        u581Var = v581.a;
                    }
                } else {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        if (((k581) it.next()).e == 1) {
                            u581Var = w581.a;
                        }
                    }
                    while (r0.hasNext()) {
                        if (((k581) obj4).e == 3) {
                            obj3 = obj4;
                            k581Var = (k581) obj3;
                            if (k581Var != null) {
                                u581Var = new u581(k581Var.a);
                            } else {
                                u581Var = v581.a;
                            }
                        }
                    }
                    k581Var = (k581) obj3;
                    if (k581Var != null) {
                        u581Var = new u581(k581Var.a);
                    } else {
                        u581Var = v581.a;
                    }
                }
                return new m581(u581Var);
            case 26:
                return Boolean.valueOf(((a781) obj).a.a.equals(((a781) obj2).a.a));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return obj;
            case 28:
                return ((Boolean) obj2).booleanValue() ? "1" : "0";
            default:
                return ((Boolean) obj2).booleanValue() ? "1" : "0";
        }
    }
}
