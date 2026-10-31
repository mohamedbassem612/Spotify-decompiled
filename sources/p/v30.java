package p;

import com.spotify.accessory.statemanager.AccessoryStateManager;
import com.spotify.mobius.Next;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v30 extends hab0 implements vu30 {
    public static final v30 N0;
    public static final v30 O0;
    public static final v30 P0;
    public static final v30 Q0;
    public static final v30 R0;
    public static final v30 S0;
    public static final v30 T0;
    public static final v30 U0;
    public static final v30 V0;
    public static final v30 W0;
    public static final v30 X;
    public static final v30 X0;
    public static final v30 Y;
    public static final v30 Y0;
    public static final v30 Z;
    public static final v30 Z0;
    public static final v30 a1;
    public static final v30 b;
    public static final v30 b1;
    public static final v30 c;
    public static final v30 c1;
    public static final v30 d;
    public static final v30 d1;
    public static final v30 e;
    public static final v30 e1;
    public static final v30 f;
    public static final v30 g;
    public static final v30 h;
    public static final v30 i;
    public static final v30 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new v30(i2, (byte) 0);
        c = new v30(i2, (byte) 1);
        d = new v30(i2, (byte) 2);
        e = new v30(i2, (byte) 3);
        f = new v30(i2, (byte) 4);
        g = new v30(i2, (byte) 5);
        h = new v30(i2, (byte) 6);
        i = new v30(i2, (byte) 7);
        t = new v30(i2, (byte) 8);
        X = new v30(i2, (byte) 9);
        Y = new v30(i2, (byte) 10);
        Z = new v30(i2, (byte) 11);
        N0 = new v30(i2, (byte) 12);
        O0 = new v30(i2, (byte) 13);
        P0 = new v30(i2, (byte) 14);
        Q0 = new v30(i2, (byte) 15);
        R0 = new v30(i2, (byte) 16);
        S0 = new v30(i2, (byte) 17);
        T0 = new v30(i2, (byte) 18);
        U0 = new v30(i2, (byte) 19);
        V0 = new v30(i2, (byte) 20);
        W0 = new v30(i2, (byte) 21);
        X0 = new v30(i2, (byte) 22);
        Y0 = new v30(i2, (byte) 23);
        Z0 = new v30(i2, (byte) 24);
        a1 = new v30(i2, (byte) 25);
        b1 = new v30(i2, (byte) 26);
        c1 = new v30(i2, (byte) 27);
        d1 = new v30(i2, (byte) 28);
        e1 = new v30(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v30(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        long jT;
        boolean z = false;
        switch (this.a) {
            case 0:
                return ((g30) obj).b;
            case 1:
                return ot11.u((f04) obj, ((c04) obj2).a());
            case 2:
                return ((v24) obj).c;
            case 3:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                n511 n511Var = ckk1.a;
                return irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1);
            case 4:
                return (f6a) obj2;
            case 5:
                return rrn1.I((ca10) obj2, (d6d) obj);
            case 6:
                return ((y5d) obj).c;
            case 7:
                AccessoryStateManager.Event event = (AccessoryStateManager.Event) obj;
                AccessoryStateManager.Event event2 = (AccessoryStateManager.Event) obj2;
                if (event.equals(event2)) {
                    qi accessory = event.getAccessory();
                    cn70 cn70Var = accessory != null ? accessory.i : null;
                    qi accessory2 = event2.getAccessory();
                    if (u890.j(cn70Var, accessory2 != null ? accessory2.i : null)) {
                        qi accessory3 = event.getAccessory();
                        String str = accessory3 != null ? accessory3.b : null;
                        qi accessory4 = event2.getAccessory();
                        if (u890.j(str, accessory4 != null ? accessory4.b : null)) {
                            qi accessory5 = event.getAccessory();
                            String str2 = accessory5 != null ? accessory5.c : null;
                            qi accessory6 = event2.getAccessory();
                            if (u890.j(str2, accessory6 != null ? accessory6.c : null)) {
                                qi accessory7 = event.getAccessory();
                                String str3 = accessory7 != null ? accessory7.d : null;
                                qi accessory8 = event2.getAccessory();
                                if (u890.j(str3, accessory8 != null ? accessory8.d : null)) {
                                    qi accessory9 = event.getAccessory();
                                    int i2 = accessory9 != null ? accessory9.e : 0;
                                    qi accessory10 = event2.getAccessory();
                                    if (i2 == (accessory10 != null ? accessory10.e : 0)) {
                                        qi accessory11 = event.getAccessory();
                                        List list = accessory11 != null ? accessory11.f : null;
                                        qi accessory12 = event2.getAccessory();
                                        if (u890.j(list, accessory12 != null ? accessory12.f : null)) {
                                            qi accessory13 = event.getAccessory();
                                            Boolean bool = accessory13 != null ? accessory13.g : null;
                                            qi accessory14 = event2.getAccessory();
                                            if (u890.j(bool, accessory14 != null ? accessory14.g : null)) {
                                                qi accessory15 = event.getAccessory();
                                                axo1 axo1Var = accessory15 != null ? accessory15.h : null;
                                                qi accessory16 = event2.getAccessory();
                                                if (u890.j(axo1Var, accessory16 != null ? accessory16.h : null)) {
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                }
                return rih1.a;
            case 9:
                return ((n6k) obj).c;
            case 10:
                return xqk.b((da10) obj2, (krk) obj);
            case 11:
                return ((ynd0) obj).b;
            case 12:
                xjo xjoVar = (xjo) obj2;
                if (xjoVar.b) {
                    return xjoVar.c ? ako.a : bko.a;
                }
                return xjoVar.a ? zjo.a : cko.a;
            case 13:
                return ((jvo) obj).a;
            case 14:
                return Boolean.valueOf(nln.z(obj, obj2));
            case 15:
                mmr0 mmr0Var = (mmr0) obj2;
                return new p7u((((Boolean) mmr0Var.a).booleanValue() || ((Boolean) mmr0Var.b).booleanValue()) ? 1 : 2);
            case 16:
                return ((lgu) obj).b;
            case 17:
                return new u7h(((afx) obj).b.a);
            case 18:
                return new u7h(((afx) obj).b.a);
            case 19:
                int i3 = u7h.l;
                return new u7h(nfb.o());
            case 20:
                return hno1.f((qim0) obj, (ecx) obj2);
            case 21:
                return ((m460) obj).c;
            case 22:
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    uwr uwrVar = cbx.a;
                    jT = ((yex) zex.a.d).d;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    uwr uwrVar2 = cbx.a;
                    jT = ((yex) zex.a.d).d;
                } else {
                    uwr uwrVar3 = cbx.a;
                    jT = z4p1.t(((yex) zex.a.d).d, so60.c);
                }
                return new u7h(jT);
            case 23:
                return ((qu70) obj).c;
            case 24:
                return ((od80) obj).b;
            case 25:
                ky80 ky80Var = (ky80) obj;
                return Next.h(ly80.a((ly80) obj2, ky80Var.e(), ky80Var.h(), ky80Var.j(), ky80Var.g(), ky80Var.d(), ky80Var.n(), ky80Var.o(), ky80Var.m(), ky80Var.i(), ky80Var.c(), ky80Var.a(), ky80Var.b(), (krm0) null, false, false, (String) null, ky80Var.k(), (String) null, ky80Var.l(), false, (jy80) null, 1708032));
            case 26:
                return ((mx80) obj).c;
            case 27:
                return (ygc0) obj2;
            case 28:
                return (snc0) obj;
            default:
                return ljo1.t((rla1) obj2, (qvc0) obj, puc0.h);
        }
    }
}
