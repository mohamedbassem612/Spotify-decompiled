package p;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class xxb0 implements Update {
    public final /* synthetic */ byte a;
    public static final xxb0 b = new xxb0(0);
    public static final xxb0 c = new xxb0(1);
    public static final xxb0 d = new xxb0(2);
    public static final xxb0 e = new xxb0(3);
    public static final xxb0 f = new xxb0(4);
    public static final xxb0 g = new xxb0(5);
    public static final xxb0 h = new xxb0(6);
    public static final xxb0 i = new xxb0(7);
    public static final xxb0 j = new xxb0(8);
    public static final xxb0 k = new xxb0(9);
    public static final xxb0 l = new xxb0(10);
    public static final xxb0 m = new xxb0(11);
    public static final xxb0 n = new xxb0(12);
    public static final xxb0 o = new xxb0(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final xxb0 f53p = new xxb0(14);
    public static final xxb0 q = new xxb0(15);
    public static final xxb0 r = new xxb0(16);
    public static final xxb0 s = new xxb0(17);
    public static final xxb0 t = new xxb0(18);
    public static final xxb0 u = new xxb0(19);
    public static final xxb0 v = new xxb0(20);
    public static final xxb0 w = new xxb0(21);
    public static final xxb0 x = new xxb0(22);
    public static final xxb0 y = new xxb0(23);
    public static final xxb0 z = new xxb0(24);
    public static final xxb0 A = new xxb0(25);
    public static final xxb0 B = new xxb0(26);
    public static final xxb0 C = new xxb0(27);
    public static final xxb0 D = new xxb0(28);
    public static final xxb0 E = new xxb0(29);

    public /* synthetic */ xxb0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0354  */
    /* JADX WARN: Code duplicated, block: B:192:0x0431  */
    /* JADX WARN: Code duplicated, block: B:402:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:470:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:483:0x0bc6  */
    private final Next c(Object obj, Object obj2) {
        ojf0 ojf0Var;
        Next nextU;
        lfm0 lfm0Var;
        bff0 bff0Var;
        Next nextJ;
        def0 def0VarP;
        ww51 ww51Var;
        jfm0 kfm0Var;
        ojf0 ojf0Var2;
        ojf0 ojf0Var3;
        xng1 xng1Var;
        boolean z2;
        xng1 xng1Var2;
        a9h a9hVar;
        String str;
        xng1 xng1Var3;
        nhf0 nhf0VarW;
        ojf0 ojf0Var4;
        ojf0 ojf0Var5;
        String str2;
        ojf0 ojf0Var6 = (ojf0) obj;
        tq80 tq80Var = (tq80) obj2;
        String str3 = ojf0Var6.b;
        boolean z3 = ojf0Var6.N0;
        vpf0 vpf0Var = ojf0Var6.c;
        lfm0 lfm0Var2 = ojf0Var6.O0;
        sif0 sif0Var = (mjf0) tq80Var.a;
        tqw tqwVar = tq80Var.b;
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        boolean z4 = sif0Var instanceof yif0;
        xm21 xm21Var = xm21.b;
        String str4 = "";
        yhf0 yhf0Var = lhf0.a;
        lfm0 lfm0Var3 = ifm0.a;
        if (z4) {
            sif0 sif0Var2 = (yif0) sif0Var;
            String str5 = ojf0Var6.i;
            boolean z5 = ojf0Var6.Y;
            List list = ojf0Var6.X;
            xng1 xng1Var4 = ojf0Var6.h;
            boolean z6 = ojf0Var6.Q0;
            dof1 dof1Var = ojf0Var6.a;
            boolean z7 = sif0Var2 instanceof wif0;
            xng1 xng1Var5 = wng1.a;
            if (z7) {
                tv80 tv80Var = ((wif0) sif0Var2).a;
                if (!z6 || !(vpf0Var instanceof vpf0)) {
                    nextU = Next.j();
                } else if (z5) {
                    if ((xng1Var4 instanceof wng1) || (xng1Var4 instanceof xng1)) {
                        nhf0 nhf0VarW2 = sjo0.w(ojf0Var6, tv80Var);
                        nextU = nhf0VarW2 != null ? Next.a(Collections.singleton(nhf0VarW2)) : Next.j();
                    } else {
                        if (!(xng1Var4 instanceof zng1) && !(xng1Var4 instanceof yng1)) {
                            eg.o();
                            return null;
                        }
                        nextU = Next.j();
                    }
                } else if (xng1Var4 instanceof wng1) {
                    def0 def0Var = (def0) o7h.s0(vpf0Var.a.a.c);
                    if (def0Var != null && (str2 = def0Var.a) != null) {
                        str4 = str2;
                    }
                    nextU = Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, new xng1(str4), (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1048447));
                } else if (xng1Var4 instanceof xng1) {
                    nextU = Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, xng1Var5, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1048447));
                } else {
                    if (!(xng1Var4 instanceof zng1) && !(xng1Var4 instanceof yng1)) {
                        eg.o();
                        return null;
                    }
                    nextU = Next.j();
                }
            } else {
                boolean z8 = sif0Var2 instanceof rif0;
                w7x w7xVar = w7x.a;
                if (z8) {
                    nextU = vpf0Var instanceof vpf0 ? Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, new kfm0(new p061(w7xVar, false), ((rif0) sif0Var2).a), false, (dn21) null, (sr3) null, 1032191)) : Next.j();
                } else {
                    boolean z9 = sif0Var2 instanceof sif0;
                    vx81 vx81Var = wx81.a;
                    if (z9) {
                        if (sif0Var2.a) {
                            vx81Var = vx81.a;
                        }
                        ojf0Var2 = ojf0Var6;
                        nextU = Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, vx81Var, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1048063));
                    } else {
                        ojf0Var2 = ojf0Var6;
                        if (!(sif0Var2 instanceof xif0)) {
                            boolean z10 = sif0Var2 instanceof tif0;
                            xng1 xng1Var6 = zng1.a;
                            mhf0 mhf0Var = mhf0.a;
                            z6x z6xVar = z6x.a;
                            if (z10) {
                                tif0 tif0Var = (tif0) sif0Var2;
                                String str6 = tif0Var.b;
                                String str7 = dof1Var.d;
                                ContextTrack contextTrack = tif0Var.a;
                                if (u890.j(str7, contextTrack.uri()) && u890.j(str3, str6)) {
                                    nextU = Next.j();
                                    ojf0Var5 = ojf0Var2;
                                } else {
                                    if (u890.j(dof1Var.d, "")) {
                                        ojf0Var4 = ojf0Var2;
                                        nextU = Next.i(ojf0.a(ojf0Var4, i1k0.z(contextTrack), str6, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1048572), f46.S0(new yhf0[]{new ihf0(contextTrack, str6, z6 ? str5 : null), new qhf0(contextTrack.uri())}));
                                    } else {
                                        ojf0Var4 = ojf0Var2;
                                        if (lfm0Var2 instanceof ffm0) {
                                            nextU = Next.j();
                                        } else if (tif0Var.c && nhc1.Y(contextTrack.uri(), "spotify:track:", false) && !l4o1.E(contextTrack)) {
                                            xj61 xj61Var = new xj61();
                                            if (lfm0Var2 instanceof lfm0) {
                                                xj61Var.add(new whf0(false));
                                            }
                                            xj61Var.add(new ihf0(contextTrack, str6, z6 ? str5 : null));
                                            xj61Var.add(new qhf0(contextTrack.uri()));
                                            xj61Var.add(mhf0Var);
                                            ojf0Var5 = ojf0Var4;
                                            nextU = Next.i(ojf0.a(ojf0Var4, i1k0.z(contextTrack), str6, wpf0.a, (bff0) null, false, xng1Var6, (String) null, vx81Var, z6xVar, false, lfm0Var3, false, (dn21) null, (sr3) null, 1022296), cwl1.j(xj61Var));
                                        } else {
                                            ojf0Var5 = ojf0Var4;
                                            nextU = Next.a(f46.S0(new yhf0[]{new whf0(false), yhf0Var}));
                                        }
                                    }
                                    ojf0Var5 = ojf0Var4;
                                }
                                ojf0Var3 = ojf0Var5;
                            } else if (sif0Var2 instanceof pif0) {
                                vpf0 vpf0Var2 = ((pif0) sif0Var2).a;
                                if (vpf0Var2 instanceof vpf0) {
                                    boolean z11 = xng1Var4 instanceof yng1;
                                    yng1 yng1Var = z11 ? (yng1) xng1Var4 : null;
                                    boolean z12 = yng1Var != null && yng1Var.a;
                                    vpf0 vpf0Var3 = vpf0Var2;
                                    a9h a9hVar2 = vpf0Var3.a;
                                    fef0 fef0Var = a9hVar2.a;
                                    List list2 = fef0Var.c;
                                    List list3 = fef0Var.i;
                                    boolean z13 = z6 && z12 && z5 && !(list2.isEmpty() && list3.isEmpty());
                                    if (str5 != null && z5 && rqt0.A(fef0Var, str5)) {
                                        xng1Var3 = new xng1(str5);
                                    } else if (z6) {
                                        List list4 = fef0Var.c;
                                        if (!list3.isEmpty() || !list4.isEmpty()) {
                                            yng1 yng1Var2 = z11 ? (yng1) xng1Var4 : null;
                                            boolean z14 = yng1Var2 != null && yng1Var2.a;
                                            if (list4.isEmpty()) {
                                                if (!z5 || list3.isEmpty()) {
                                                    xng1Var4 = xng1Var6;
                                                }
                                            } else if ((!z14 || !z5) && z14) {
                                                xng1Var4 = new xng1(((def0) o7h.q0(list4)).a);
                                            }
                                            xng1Var4 = xng1Var5;
                                        } else if (!z11) {
                                            xng1Var4 = xng1Var6;
                                        }
                                        xng1Var3 = xng1Var4;
                                    } else {
                                        xng1Var3 = xng1Var5;
                                    }
                                    ojf0Var6 = ojf0Var2;
                                    ojf0 ojf0VarA = ojf0.a(ojf0Var6, (dof1) null, (String) null, vpf0Var3, a9hVar2.b, true, xng1Var3, (String) null, vx81Var, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1039699);
                                    xj61 xj61Var2 = new xj61();
                                    xj61Var2.add(new jhf0(vpf0Var2));
                                    xj61Var2.add(hhf0.a);
                                    if (z13 && (nhf0VarW = sjo0.w(ojf0VarA, (tv80) null)) != null) {
                                        xj61Var2.add(nhf0VarW);
                                    }
                                    nextU = Next.i(ojf0VarA, cwl1.j(xj61Var2));
                                } else {
                                    if (!(vpf0Var2 instanceof wpf0) && !(vpf0Var2 instanceof upf0)) {
                                        eg.o();
                                        return null;
                                    }
                                    ojf0Var3 = ojf0Var2;
                                    nextU = Next.h(ojf0.a(ojf0Var2, (dof1) null, (String) null, vpf0Var2, (bff0) null, false, xng1Var6, (String) null, vx81Var, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1039707));
                                }
                            } else {
                                ojf0Var3 = ojf0Var2;
                                if (sif0Var2 instanceof oif0) {
                                    oif0 oif0Var = (oif0) sif0Var2;
                                    if (vpf0Var instanceof vpf0) {
                                        fef0 fef0Var2 = vpf0Var.a.a;
                                        if (fef0Var2.b != 1) {
                                            nextU = Next.a(Collections.singleton(new shf0(((aef0) fef0Var2.a.get(oif0Var.a)).a)));
                                        } else {
                                            nextU = Next.j();
                                        }
                                    } else {
                                        nextU = Next.j();
                                    }
                                } else if (sif0Var2 instanceof gif0) {
                                    gif0 gif0Var = (gif0) sif0Var2;
                                    if (vpf0Var instanceof vpf0) {
                                        ojf0 ojf0VarA2 = ojf0.a(ojf0Var3, (dof1) null, (String) null, (xpf0) null, (bff0) null, gif0Var.a, (aog1) null, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1048543);
                                        ojf0Var3 = ojf0Var3;
                                        nextU = Next.h(ojf0VarA2);
                                    } else {
                                        nextU = Next.j();
                                    }
                                } else if (sif0Var2 instanceof iif0) {
                                    if (vpf0Var instanceof vpf0) {
                                        ojf0 ojf0VarA3 = ojf0.a(ojf0Var3, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, Collections.singletonList(bim.a), false, (pfm0) null, false, (dn21) null, (sr3) null, 1047551);
                                        ojf0Var3 = ojf0Var3;
                                        nextU = Next.h(ojf0VarA3);
                                    } else {
                                        nextU = Next.j();
                                    }
                                } else if (sif0Var2 instanceof jif0) {
                                    if (list.isEmpty()) {
                                        nextU = Next.j();
                                    } else {
                                        ojf0 ojf0VarA4 = ojf0.a(ojf0Var3, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, z6xVar, false, (pfm0) null, false, (dn21) null, (sr3) null, 1047551);
                                        ojf0Var3 = ojf0Var3;
                                        nextU = Next.h(ojf0VarA4);
                                    }
                                } else if (sif0Var2 instanceof hif0) {
                                    if (list.size() > 1) {
                                        ojf0 ojf0VarA5 = ojf0.a(ojf0Var3, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, o7h.l0(1, list), false, (pfm0) null, false, (dn21) null, (sr3) null, 1047551);
                                        ojf0Var3 = ojf0Var3;
                                        nextU = Next.h(ojf0VarA5);
                                    } else {
                                        nextU = Next.j();
                                    }
                                } else if (sif0Var2 instanceof kif0) {
                                    if (vpf0Var instanceof vpf0) {
                                        ojf0 ojf0VarA6 = ojf0.a(ojf0Var3, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, o7h.O0(cim.a, list), false, (pfm0) null, false, (dn21) null, (sr3) null, 1047551);
                                        ojf0Var3 = ojf0Var3;
                                        nextU = Next.h(ojf0VarA6);
                                    } else {
                                        nextU = Next.j();
                                    }
                                } else if (sif0Var2 instanceof lif0) {
                                    if (vpf0Var instanceof vpf0) {
                                        ojf0 ojf0VarA7 = ojf0.a(ojf0Var3, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, z6xVar, false, (pfm0) null, false, (dn21) null, (sr3) null, 1047551);
                                        ojf0Var3 = ojf0Var3;
                                        nextU = Next.i(ojf0VarA7, dm61.A0(sjo0.w(ojf0Var3, tv80VarY)));
                                    } else {
                                        nextU = Next.j();
                                    }
                                } else if (sif0Var2 instanceof mif0) {
                                    hkf0 hkf0Var = ((mif0) sif0Var2).a;
                                    boolean z15 = ojf0Var3.R0;
                                    vpf0 vpf0Var4 = vpf0Var instanceof vpf0 ? vpf0Var : null;
                                    if (vpf0Var4 == null) {
                                        nextU = Next.j();
                                    } else {
                                        a9h a9hVar3 = vpf0Var4.a;
                                        if (z15) {
                                            int iOrdinal = hkf0Var.ordinal();
                                            if (iOrdinal == 0) {
                                                String str8 = dof1Var.d;
                                                bef0 bef0Var = a9hVar3.a.f;
                                                qr3 qr3Var = new qr3(str8, bef0Var.c, bef0Var.a);
                                                ojf0Var6 = ojf0Var3;
                                                nextU = Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, z6xVar, false, (pfm0) null, false, (dn21) null, qr3Var, 523263));
                                            } else if (iOrdinal == 1) {
                                                nextU = sjo0.o(ojf0Var3, xm21.a);
                                            } else if (iOrdinal == 2) {
                                                nextU = sjo0.o(ojf0Var3, xm21Var);
                                            } else {
                                                if (iOrdinal != 3) {
                                                    eg.o();
                                                    return null;
                                                }
                                                ojf0 ojf0VarA8 = ojf0.a(ojf0Var3, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, z6xVar, false, (pfm0) null, false, (dn21) null, (sr3) null, 1047551);
                                                ojf0Var3 = ojf0Var3;
                                                String str9 = dof1Var.d;
                                                bef0 bef0Var2 = a9hVar3.a.f;
                                                nextU = Next.i(ojf0VarA8, f46.S0(new yhf0[]{new uhf0("INCORRECT_SYNC", str9, bef0Var2.c, bef0Var2.a, vdi1.a), new ohf0(z15)}));
                                            }
                                        } else {
                                            ojf0Var6 = ojf0Var3;
                                            ojf0 ojf0VarA9 = ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, z6xVar, false, (pfm0) null, false, (dn21) null, (sr3) null, 1047551);
                                            int iOrdinal2 = hkf0Var.ordinal();
                                            if (iOrdinal2 == 0) {
                                                str = "ALL_INCORRECT_LYRICS";
                                            } else if (iOrdinal2 == 1) {
                                                str = "SOME_INCORRECT_LYRICS";
                                            } else if (iOrdinal2 == 2) {
                                                nextU = Next.j();
                                            } else {
                                                if (iOrdinal2 != 3) {
                                                    eg.o();
                                                    return null;
                                                }
                                                str = "INCORRECT_SYNC";
                                            }
                                            String str10 = dof1Var.d;
                                            bef0 bef0Var3 = a9hVar3.a.f;
                                            nextU = Next.i(ojf0VarA9, f46.S0(new yhf0[]{new thf0(str, str10, bef0Var3.c, bef0Var3.a), new ohf0(z15)}));
                                        }
                                    }
                                    ojf0Var6 = ojf0Var3;
                                } else {
                                    ojf0Var6 = ojf0Var3;
                                    if (sif0Var2 instanceof qif0) {
                                        boolean z16 = ((qif0) sif0Var2).a;
                                        if (z16 == z6) {
                                            nextU = Next.j();
                                        } else if (z16) {
                                            vpf0 vpf0Var5 = vpf0Var instanceof vpf0 ? vpf0Var : null;
                                            a9h a9hVar4 = vpf0Var5 != null ? vpf0Var5.a : null;
                                            if (!z5 || str5 == null || a9hVar4 == null) {
                                                nextU = Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, (pfm0) null, true, (dn21) null, (sr3) null, 983039));
                                            } else {
                                                fef0 fef0Var3 = a9hVar4.a;
                                                if (rqt0.A(fef0Var3, str5)) {
                                                    nextU = Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, new xng1(str5), (String) null, (xx81) null, (List) null, false, (pfm0) null, true, (dn21) null, (sr3) null, 982911));
                                                } else {
                                                    nextU = fef0Var3.i.contains(str5) ? Next.i(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, true, (pfm0) null, true, (dn21) null, (sr3) null, 974847), Collections.singleton(new khf0(dof1Var.d, str3, str5, (a9h) null))) : Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, (pfm0) null, true, (dn21) null, (sr3) null, 983039));
                                                }
                                            }
                                        } else {
                                            vpf0 vpf0Var6 = vpf0Var instanceof vpf0 ? vpf0Var : null;
                                            fef0 fef0Var4 = (vpf0Var6 == null || (a9hVar = vpf0Var6.a) == null) ? null : a9hVar.a;
                                            if (!z5 || str5 == null || fef0Var4 == null || !rqt0.A(fef0Var4, str5)) {
                                                if (xng1Var4 instanceof xng1) {
                                                    xng1Var2 = xng1Var5;
                                                }
                                                nextU = Next.i(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, xng1Var2, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 974719), Collections.singleton(mhf0Var));
                                            } else {
                                                xng1Var4 = new xng1(str5);
                                            }
                                            xng1Var2 = xng1Var4;
                                            nextU = Next.i(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, xng1Var2, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 974719), Collections.singleton(mhf0Var));
                                        }
                                    } else if (sif0Var2 instanceof nif0) {
                                        nif0 nif0Var = (nif0) sif0Var2;
                                        String str11 = nif0Var.a;
                                        if (z6 && (vpf0Var instanceof vpf0)) {
                                            xng1 xng1Var7 = xng1Var4 instanceof xng1 ? xng1Var4 : null;
                                            if (u890.j(str11, xng1Var7 != null ? xng1Var7.a : null)) {
                                                nextU = Next.j();
                                            } else if (u890.j(str11, "__off__")) {
                                                nextU = xng1Var4 instanceof wng1 ? Next.j() : Next.i(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, xng1Var5, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1039999), Collections.singleton(new xhf0(null)));
                                            } else {
                                                a9h a9hVar5 = vpf0Var.a;
                                                List list5 = a9hVar5.a.c;
                                                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                                    Iterator it = list5.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            z2 = false;
                                                            break;
                                                        }
                                                        if (u890.j(((def0) it.next()).a, str11)) {
                                                            z2 = true;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z2 = false;
                                                    break;
                                                }
                                                nextU = Next.i(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, nif0Var.a, (xx81) null, (List) null, true, (pfm0) null, false, (dn21) null, (sr3) null, 1040127), f46.S0(new yhf0[]{new khf0(dof1Var.d, str3, str11, z2 ? a9hVar5 : null), new xhf0(str11)}));
                                            }
                                        } else {
                                            nextU = Next.j();
                                        }
                                    } else if (sif0Var2 instanceof vif0) {
                                        vif0 vif0Var = (vif0) sif0Var2;
                                        String str12 = vif0Var.a;
                                        String str13 = vif0Var.c;
                                        a9h a9hVar6 = vif0Var.b;
                                        if (!u890.j(str12, dof1Var.d)) {
                                            xng1Var = xng1Var5;
                                            nextU = Next.j();
                                        } else if (z3) {
                                            if (rqt0.A(a9hVar6.a, str13)) {
                                                xng1Var = new xng1(str13);
                                            }
                                            nextU = Next.i(ojf0.a(ojf0Var6, (dof1) null, (String) null, new vpf0(a9hVar6), a9hVar6.b, false, xng1Var, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1040243), w7xVar);
                                        } else {
                                            nextU = Next.j();
                                        }
                                    } else {
                                        if (!(sif0Var2 instanceof uif0)) {
                                            xng1Var = xng1Var5;
                                            eg.o();
                                            return null;
                                        }
                                        if (z3) {
                                            ojf0Var3 = ojf0Var6;
                                            nextU = Next.h(ojf0.a(ojf0Var6, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, (dn21) null, (sr3) null, 1040383));
                                        } else {
                                            nextU = Next.j();
                                        }
                                    }
                                }
                            }
                        } else if (!(vpf0Var instanceof vpf0)) {
                            nextU = Next.j();
                        } else if ((ojf0Var2.t instanceof vx81) && !(lfm0Var2 instanceof lfm0)) {
                            nextU = Next.i(ojf0.a(ojf0Var2, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, new lfm0(ay81.a), false, (dn21) null, (sr3) null, 1032191), Collections.singleton(new whf0(true)));
                            ojf0Var2 = ojf0Var2;
                        } else if (lfm0Var2 instanceof lfm0) {
                            ojf0 ojf0VarA10 = ojf0.a(ojf0Var2, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, lfm0Var3, false, (dn21) null, (sr3) null, 1032191);
                            ojf0Var2 = ojf0Var2;
                            nextU = Next.i(ojf0VarA10, Collections.singleton(new whf0(false)));
                        } else {
                            ojf0Var2 = ojf0Var2;
                            nextU = Next.j();
                        }
                        ojf0Var = ojf0Var3;
                    }
                    ojf0Var3 = ojf0Var2;
                    ojf0Var = ojf0Var3;
                }
            }
            ojf0Var3 = ojf0Var6;
            ojf0Var = ojf0Var3;
        } else {
            tv80 tv80Var2 = tv80VarY;
            ojf0Var = ojf0Var6;
            if (!(sif0Var instanceof ijf0)) {
                ojf0Var = ojf0Var;
                if (sif0Var instanceof fjf0) {
                    nextU = bwp0.o(ojf0Var, (fjf0) sif0Var);
                } else if (sif0Var instanceof ljf0) {
                    jjf0 jjf0Var = (ljf0) sif0Var;
                    if (jjf0Var instanceof kjf0) {
                        if (lfm0Var2 instanceof lfm0) {
                            by81 by81Var = lfm0Var2.a;
                            if (by81Var instanceof zx81) {
                                nextU = Next.a(Collections.singleton(new bif0(((zx81) by81Var).a)));
                            } else {
                                nextU = Next.j();
                            }
                        } else {
                            nextU = Next.j();
                        }
                    } else {
                        if (!(jjf0Var instanceof jjf0)) {
                            eg.o();
                            return null;
                        }
                        jjf0 jjf0Var2 = jjf0Var;
                        if (vpf0Var instanceof vpf0) {
                            boolean z17 = jjf0Var2.a;
                            if (z17) {
                                lfm0Var = new lfm0(new zx81(jjf0Var2.b));
                            }
                            if (z17) {
                                lfm0Var = lfm0Var3;
                                bff0 bff0Var2 = vpf0Var.a.b;
                                if (bff0Var2.f) {
                                    lfm0Var = lfm0Var3;
                                    bff0Var = vpf0Var.a.b;
                                } else {
                                    int i2 = bff0Var2.d;
                                    int i3 = bff0Var2.a;
                                    int i4 = bff0Var2.c;
                                    bff0Var = new bff0(i2, i2, i4, i3, i4, false);
                                }
                            } else {
                                lfm0Var = lfm0Var3;
                                bff0Var = vpf0Var.a.b;
                            }
                            nextU = Next.h(ojf0.a(ojf0Var, (dof1) null, (String) null, (xpf0) null, bff0Var, false, (aog1) null, (String) null, (xx81) null, (List) null, false, lfm0Var, false, (dn21) null, (sr3) null, 1032183));
                        } else {
                            nextU = Next.j();
                        }
                    }
                } else if (sif0Var instanceof dif0) {
                    nextU = yah0.t(ojf0Var);
                } else if (sif0Var instanceof eif0) {
                    nextU = lfm0Var2 instanceof jfm0 ? Next.i(ojf0.a(ojf0Var, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, lfm0Var3, false, (dn21) null, (sr3) null, 770047), Collections.singleton(vhf0.a)) : Next.a(f46.S0(new yhf0[]{new whf0(false), yhf0Var}));
                } else {
                    if (!(sif0Var instanceof fif0)) {
                        eg.o();
                        return null;
                    }
                    fif0 fif0Var = (fif0) sif0Var;
                    nextU = yah0.u(ojf0Var, fif0Var, fif0Var.b);
                }
            } else if (lfm0Var2 instanceof ffm0) {
                hjf0 hjf0Var = (ijf0) sif0Var;
                jfm0 jfm0Var = ojf0Var.O0;
                if (!(jfm0Var instanceof ffm0)) {
                    n57.e("Selection mode update invoked for incompatible mode: " + jfm0Var);
                    nextJ = Next.j();
                    ojf0Var = ojf0Var;
                } else if (hjf0Var instanceof hjf0) {
                    jfm0 jfm0Var2 = (ffm0) jfm0Var;
                    hjf0 hjf0Var2 = hjf0Var;
                    boolean z18 = hjf0Var2.b;
                    Set set = hjf0Var2.a;
                    if (jfm0Var2 instanceof jfm0) {
                        kfm0Var = new jfm0(new p061(set, z18), jfm0Var2.b);
                    } else if (jfm0Var2 instanceof kfm0) {
                        kfm0Var = new kfm0(new p061(set, z18), 0);
                    } else {
                        eg.o();
                        nextJ = null;
                    }
                    ojf0Var = ojf0Var;
                    nextJ = Next.h(ojf0.a(ojf0Var, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, kfm0Var, false, (dn21) null, (sr3) null, 1032191));
                } else if (hjf0Var.equals(gjf0.a)) {
                    ffm0 ffm0Var = (ffm0) jfm0Var;
                    vpf0 vpf0Var7 = ojf0Var.c;
                    vpf0 vpf0Var8 = vpf0Var7 instanceof vpf0 ? vpf0Var7 : null;
                    a9h a9hVar7 = vpf0Var8 != null ? vpf0Var8.a : null;
                    Set set2 = ffm0Var.e1().a;
                    if (a9hVar7 != null) {
                        fef0 fef0Var5 = a9hVar7.a;
                        if (set2.isEmpty()) {
                            ojf0Var = ojf0Var;
                            n57.e("Lyrics must be loaded and selected before enabling continue button");
                            nextJ = Next.j();
                        } else if (ffm0Var instanceof jfm0) {
                            Set set3 = set2;
                            ArrayList arrayList = new ArrayList(q7h.U(set3, 10));
                            Iterator it2 = set3.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((vhc0) it2.next()).a));
                            }
                            List listZ0 = o7h.Z0(arrayList);
                            jfm0 jfm0Var3 = jfm0Var instanceof jfm0 ? jfm0Var : null;
                            if (jfm0Var3 == null || jfm0Var3.b != xm21Var || (def0VarP = c921.p(ojf0Var)) == null) {
                                ww51Var = null;
                            } else {
                                List list6 = listZ0;
                                ArrayList arrayList2 = new ArrayList(q7h.U(list6, 10));
                                Iterator it3 = list6.iterator();
                                while (it3.hasNext()) {
                                    int iIntValue = ((Number) it3.next()).intValue();
                                    List list7 = def0VarP.b;
                                    arrayList2.add((String) ((iIntValue < 0 || iIntValue >= list7.size()) ? "" : list7.get(iIntValue)));
                                }
                                ww51Var = new ww51(arrayList2, def0VarP.c);
                            }
                            List list8 = listZ0;
                            ArrayList arrayList3 = new ArrayList(q7h.U(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((aef0) fef0Var5.a.get(((Number) it4.next()).intValue())).b);
                            }
                            ArrayList arrayList4 = ww51Var != null ? ww51Var.a : null;
                            boolean z19 = ww51Var != null && ww51Var.b;
                            ojf0Var = ojf0Var;
                            nextJ = Next.h(ojf0.a(ojf0Var, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, (pfm0) null, false, new dn21(arrayList3, listZ0, arrayList4, z19, z6x.a), (sr3) null, 786431));
                        } else {
                            ojf0Var = ojf0Var;
                            LinkedHashMap linkedHashMapY = yah0.y(fef0Var5.a, set2);
                            dof1 dof1Var2 = ojf0Var.a;
                            Set set4 = set2;
                            ArrayList arrayList5 = new ArrayList(q7h.U(set4, 10));
                            Iterator it5 = set4.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(Integer.valueOf(((vhc0) it5.next()).a));
                            }
                            c9 c9VarZ = c921.z(ojf0Var, arrayList5);
                            def0 def0VarE = c921.E(ojf0Var);
                            nextJ = Next.a(Collections.singleton(new zhf0(linkedHashMapY, dof1Var2, a9hVar7, tv80Var2, 1, c9VarZ, def0VarE != null ? new gy71(def0VarE.a, def0VarE.c) : null)));
                        }
                    } else {
                        ojf0Var = ojf0Var;
                        n57.e("Lyrics must be loaded and selected before enabling continue button");
                        nextJ = Next.j();
                    }
                } else {
                    eg.o();
                    nextJ = null;
                }
                nextU = nextJ;
            } else {
                ojf0Var = ojf0Var;
                nextU = Next.j();
            }
        }
        return yah0.r(nextU, ojf0Var);
    }

    /* JADX WARN: Code duplicated, block: B:176:0x02fe  */
    private final Next d(Object obj, Object obj2) {
        int iL;
        zrf0 zrf0Var;
        xlf0 xlf0Var;
        boolean z2;
        gsf0 gsf0Var = (gsf0) obj;
        uqf0 uqf0Var = (xqf0) obj2;
        dsf0 dsf0Var = gsf0Var.h;
        urf0 urf0Var = gsf0Var.t;
        srf0 srf0Var = gsf0Var.Y;
        List list = gsf0Var.g;
        boolean z3 = true;
        boolean z4 = false;
        if (uqf0Var instanceof uqf0) {
            zrf0 zrf0Var2 = uqf0Var.a;
            boolean z5 = zrf0Var2 instanceof zrf0;
            if (z5) {
                xrf0 xrf0Var = zrf0Var2.a;
                xrf0 xrf0Var2 = xrf0Var instanceof xrf0 ? xrf0Var : null;
                if (xrf0Var2 == null || (xlf0Var = (xlf0) o7h.t0(xrf0Var2.a, list)) == null) {
                    z2 = false;
                } else {
                    int length = xlf0Var.b.length();
                    int i2 = xrf0Var2.b;
                    z2 = !(i2 >= 0 && i2 <= length);
                }
                if (z2) {
                    return Next.j();
                }
            }
            if (z5) {
                zrf0 zrf0Var3 = gsf0Var.X;
                if (zrf0Var3 instanceof bsf0) {
                    zrf0Var = new zrf0(zrf0Var2.a, true, false);
                } else if (!(zrf0Var3 instanceof zrf0)) {
                    if (!u890.j(zrf0Var3, asf0.a)) {
                        eg.o();
                        return null;
                    }
                    if (srf0Var.f) {
                        zrf0Var2 = zrf0Var2;
                    } else {
                        zrf0Var = new zrf0(zrf0Var2.a, true, false);
                    }
                } else if (srf0Var.f) {
                    zrf0Var2 = zrf0Var2;
                } else {
                    zrf0 zrf0Var4 = zrf0Var2;
                    yrf0 yrf0Var = zrf0Var4.a;
                    int iA = yrf0Var.a() - zrf0Var3.a.a();
                    if (iA >= 0 && iA < 2) {
                        z4 = zrf0Var4.c;
                    }
                    zrf0Var2 = new zrf0(yrf0Var, true, z4);
                }
                zrf0Var2 = zrf0Var;
            } else if (!(zrf0Var2 instanceof asf0)) {
                if (zrf0Var2 instanceof bsf0) {
                    eg.m("SyncState.Uninitialized should be only used to initialize the state.");
                    return null;
                }
                eg.o();
                return null;
            }
            return Next.h(gsf0.a(gsf0Var, (vrf0) null, zrf0Var2, (srf0) null, 0.0f, (iu30) null, (iu30) null, 8387583));
        }
        if (uqf0Var instanceof wqf0) {
            Map map = ((wqf0) uqf0Var).a;
            if (map.isEmpty()) {
                return Next.j();
            }
            dhf0 dhf0Var = gsf0Var.c;
            if (!(urf0Var instanceof urf0)) {
                if (urf0Var instanceof trf0) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            Map map2 = urf0Var.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            for (Map.Entry entry : map.entrySet()) {
                jae jaeVar = (jae) entry.getKey();
                int i3 = jaeVar.a;
                bn21 bn21Var = (cn21) entry.getValue();
                bn21 bn21Var2 = (cn21) linkedHashMap.get(jaeVar);
                if (bn21Var2 instanceof an21) {
                    bn21Var = bn21Var2;
                } else if (!(bn21Var instanceof an21) && (bn21Var2 instanceof bn21) && (bn21Var instanceof bn21)) {
                    Map map3 = bn21Var2.a;
                    Map map4 = bn21Var.a;
                    if (!u890.j(map3, map4)) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                        for (Map.Entry entry2 : map4.entrySet()) {
                            if (!linkedHashMap2.containsKey(entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                String str = ((fic0) entry2.getValue()).a;
                                Objects.toString(dhf0Var);
                            }
                        }
                        map3 = linkedHashMap2;
                    }
                    bn21Var = new bn21(map3);
                }
                linkedHashMap.put(jaeVar, bn21Var);
            }
            boolean zEquals = linkedHashMap.equals(map2);
            Map map5 = linkedHashMap;
            if (zEquals) {
                map5 = map2;
            }
            if (map5.equals(map2)) {
                return Next.j();
            }
            int i4 = 0;
            for (bn21 bn21Var3 : map5.values()) {
                if (bn21Var3 instanceof bn21) {
                    Iterator it = bn21Var3.a.values().iterator();
                    iL = 0;
                    while (it.hasNext()) {
                        iL += vno1.l(((fic0) it.next()).a);
                    }
                } else {
                    if (!(bn21Var3 instanceof an21)) {
                        eg.o();
                        return null;
                    }
                    iL = vno1.l(((an21) bn21Var3).a);
                }
                i4 += iL;
            }
            Objects.toString(dhf0Var);
            if (!gsf0Var.e && i4 < 140) {
                return Next.h(gsf0.a(gsf0Var, new urf0(map5), (csf0) null, (srf0) null, 0.0f, (iu30) null, (iu30) null, 8388095));
            }
            return Next.i(gsf0.a(gsf0Var, trf0.a, (csf0) null, (srf0) null, 0.0f, (iu30) null, (iu30) null, 8388095), Effects.a(new oqf0[]{new oqf0(gsf0Var.f, gsf0Var.a, gsf0Var.b, gsf0Var.d, gsf0Var.c, gsf0Var.e, (dsf0Var instanceof dsf0) && dsf0Var.c != 1)}));
        }
        if (!(uqf0Var instanceof tqf0)) {
            if (uqf0Var instanceof vqf0) {
                return Next.h(gsf0.a(gsf0Var, (vrf0) null, (csf0) null, (srf0) null, ((vqf0) uqf0Var).a, (iu30) null, (iu30) null, 8257535));
            }
            if (uqf0Var instanceof sqf0) {
                float f2 = ((sqf0) uqf0Var).a;
                return gsf0Var.R0 == f2 ? Next.j() : Next.a(Collections.singleton(new rqf0(f2)));
            }
            eg.o();
            return null;
        }
        int i5 = ((tqf0) uqf0Var).a;
        iu30 iu30Var = gsf0Var.V0;
        mrf0 mrf0Var = srf0Var.a;
        if (mrf0Var instanceof hrf0) {
            return Next.a(Collections.singleton(new nqf0(new hsf0(i5), iu30Var)));
        }
        boolean z6 = mrf0Var instanceof mrf0;
        krf0 krf0Var = jrf0.a;
        Map linkedHashMap3 = b7x.a;
        krf0 krf0Var2 = krf0.a;
        if (z6) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((xlf0) it2.next()).b);
            }
            mrf0 mrf0Var2 = mrf0Var;
            boolean z7 = mrf0Var2.c;
            Map map6 = mrf0Var2.b;
            if (z7) {
                dsf0 dsf0Var2 = dsf0Var instanceof dsf0 ? dsf0Var : null;
                List list3 = dsf0Var2 != null ? dsf0Var2.a : null;
                String str2 = (String) o7h.t0(i5, arrayList);
                String str3 = list3 != null ? (String) o7h.t0(i5, list3) : null;
                if (str3 == null) {
                    str3 = "";
                }
                if (str2 == null || str2.length() == 0) {
                    linkedHashMap3 = map6;
                } else if (!u890.j(map6.get(new vhc0(i5)), krf0Var2)) {
                    if (str2.length() > 200 || str3.length() > 200) {
                        linkedHashMap3 = map6;
                    } else {
                        linkedHashMap3 = Collections.singletonMap(new vhc0(i5), krf0Var2);
                    }
                }
            } else {
                linkedHashMap3 = suo1.A(map6, arrayList, i5);
            }
            if (linkedHashMap3.equals(map6)) {
                return Next.j();
            }
            Collection collectionValues = linkedHashMap3.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it3 = collectionValues.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (u890.j((lrf0) it3.next(), krf0Var2)) {
                            Collection collectionValues2 = linkedHashMap3.values();
                            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                                Iterator it4 = collectionValues2.iterator();
                                while (it4.hasNext()) {
                                    if (u890.j((lrf0) it4.next(), krf0Var)) {
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    z3 = false;
                    break;
                }
            }
            z3 = false;
            break;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                if (u890.j(entry3.getValue(), krf0Var2)) {
                    linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                }
            }
            return Next.i(gsf0.a(gsf0Var, (vrf0) null, (csf0) null, srf0.a(srf0Var, new mrf0(mrf0Var2.a, linkedHashMap3, z7)), 0.0f, (iu30) null, (iu30) null, 8386559), Collections.singleton(new nqf0(new jsf0(linkedHashMap4.keySet(), z3), iu30Var)));
        }
        if (!(mrf0Var instanceof irf0)) {
            eg.o();
            return null;
        }
        List list4 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
        Iterator it5 = list4.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((xlf0) it5.next()).b);
        }
        Map map7 = ((irf0) mrf0Var).a;
        if (((CharSequence) arrayList2.get(i5)).length() == 0) {
            linkedHashMap3 = map7;
        } else {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry entry4 : map7.entrySet()) {
                if (u890.j((lrf0) entry4.getValue(), krf0Var2)) {
                    linkedHashMap5.put(entry4.getKey(), entry4.getValue());
                }
            }
            Set setO1 = o7h.o1(linkedHashMap5.keySet());
            if (setO1.contains(new vhc0(i5))) {
                setO1.remove(new vhc0(i5));
            } else if (setO1.size() < 10) {
                setO1.add(new vhc0(i5));
            }
            if (!setO1.isEmpty()) {
                boolean z8 = setO1.size() == 10;
                tr80 tr80VarK = p7h.K(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                lr80 it6 = tr80VarK.iterator();
                while (((sr80) it6).c) {
                    Object next = it6.next();
                    int iIntValue = ((Number) next).intValue();
                    if (((CharSequence) arrayList2.get(iIntValue)).length() > 0 && (!z8 || setO1.contains(new vhc0(iIntValue)))) {
                        arrayList3.add(next);
                    }
                }
                int iS = zno1.s(q7h.U(arrayList3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap3 = new LinkedHashMap(iS);
                Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    int iIntValue2 = ((Number) it7.next()).intValue();
                    linkedHashMap3.put(new vhc0(iIntValue2), setO1.contains(new vhc0(iIntValue2)) ? krf0Var2 : krf0Var);
                }
            }
        }
        if (linkedHashMap3.equals(map7)) {
            return Next.j();
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
            if (u890.j((lrf0) entry5.getValue(), krf0Var2)) {
                linkedHashMap6.put(entry5.getKey(), entry5.getValue());
            }
        }
        Set setKeySet = linkedHashMap6.keySet();
        return Next.i(gsf0.a(gsf0Var, (vrf0) null, (csf0) null, srf0.a(srf0Var, new irf0(linkedHashMap3)), 0.0f, (iu30) null, (iu30) null, 8386559), Collections.singleton(new nqf0(new jsf0(setKeySet, setKeySet.size() == 10), iu30Var)));
    }

    private final Next e(Object obj, Object obj2) {
        ofg0 ofg0VarA;
        ofg0 ofg0Var = (ofg0) obj;
        jfg0 jfg0Var = (nfg0) obj2;
        if (jfg0Var instanceof ifg0) {
            return Next.a(Collections.singleton(seg0.f));
        }
        if (jfg0Var instanceof lfg0) {
            ofg0Var.getClass();
            return oqn1.j(ofg0Var, w5k1.a);
        }
        if (jfg0Var instanceof kfg0) {
            ofg0Var.getClass();
            return oqn1.j(ofg0Var, w5k1.b);
        }
        if (jfg0Var instanceof mfg0) {
            ofg0Var.getClass();
            return oqn1.j(ofg0Var, w5k1.c);
        }
        if (!(jfg0Var instanceof jfg0)) {
            eg.o();
            return null;
        }
        ofg0Var.getClass();
        jfg0 jfg0Var2 = jfg0Var;
        w5k1 w5k1Var = jfg0Var2.a;
        boolean z2 = jfg0Var2.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int iOrdinal = w5k1Var.ordinal();
        weg0 weg0Var = weg0.f;
        if (iOrdinal == 0) {
            boolean z3 = ofg0Var.f;
            Boolean bool = ofg0Var.c;
            if (!z3 || bool == null) {
                return Next.j();
            }
            if (z2) {
                ofg0VarA = ofg0.a(ofg0Var, null, null, null, false, false, false, 223);
            } else {
                linkedHashSet.add(weg0Var);
                ofg0VarA = ofg0.a(ofg0Var, Boolean.valueOf(!bool.booleanValue()), null, null, false, false, false, 219);
            }
        } else if (iOrdinal == 1) {
            boolean z4 = ofg0Var.g;
            Boolean bool2 = ofg0Var.d;
            if (!z4 || bool2 == null) {
                return Next.j();
            }
            if (z2) {
                ofg0VarA = ofg0.a(ofg0Var, null, null, null, false, false, false, 191);
            } else {
                linkedHashSet.add(weg0Var);
                ofg0VarA = ofg0.a(ofg0Var, null, Boolean.valueOf(!bool2.booleanValue()), null, false, false, false, 183);
            }
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            boolean z5 = ofg0Var.h;
            Boolean bool3 = ofg0Var.e;
            if (!z5 || bool3 == null) {
                return Next.j();
            }
            if (z2) {
                ofg0VarA = ofg0.a(ofg0Var, null, null, null, false, false, false, 127);
            } else {
                linkedHashSet.add(weg0Var);
                ofg0VarA = ofg0.a(ofg0Var, null, null, Boolean.valueOf(!bool3.booleanValue()), false, false, false, 111);
            }
        }
        return Next.i(ofg0VarA, linkedHashSet);
    }

    private final Next f(Object obj, Object obj2) {
        int i2;
        List list;
        gsh0 gsh0Var = (gsh0) obj;
        zrh0 zrh0Var = (fsh0) obj2;
        List list2 = gsh0Var.b;
        boolean z2 = gsh0Var.c;
        int i3 = gsh0Var.a;
        List list3 = gsh0Var.e;
        int i4 = gsh0Var.g;
        p8i0 p8i0Var = gsh0Var.X;
        if (zrh0Var instanceof csh0) {
            return Next.a(Collections.singleton(new erh0(i4 > 0)));
        }
        boolean z3 = zrh0Var instanceof zrh0;
        z6x z6xVar = z6x.a;
        if (z3) {
            int i5 = zrh0Var.a;
            if (i5 == i3) {
                return Next.j();
            }
            if (i3 == 4 && i5 == 3) {
                return Next.j();
            }
            if (i5 == 1 || i5 == 2) {
                return z2 ? Next.h(gsh0.a(gsh0Var, i5, (List) null, false, false, z6xVar, false, false, (p8i0) null, 2030)) : Next.i(gsh0.a(gsh0Var, i5, z6xVar, true, true, z6xVar, false, false, (p8i0) null, 2016), Collections.singleton(new jrh0(p8i0Var, 0)));
            }
            return Next.h(gsh0.a(gsh0Var, i5, (List) null, false, false, z6xVar, false, false, (p8i0) null, 2030));
        }
        if (zrh0Var instanceof ash0) {
            return Next.h(gsh0.a(gsh0Var, 4, (List) null, false, false, (List) null, false, false, (p8i0) null, 2046));
        }
        if (zrh0Var instanceof xrh0) {
            xrh0 xrh0Var = (xrh0) zrh0Var;
            p8i0 p8i0Var2 = xrh0Var.d;
            List list4 = xrh0Var.a;
            if (p8i0Var2 != p8i0Var) {
                return Next.j();
            }
            if (xrh0Var.c == 0) {
                list = list4;
            } else {
                ArrayList arrayListN0 = o7h.N0(list4, list2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListN0) {
                    if (hashSet.add(Long.valueOf(((xoh0) obj3).a))) {
                        arrayList.add(obj3);
                    }
                }
                list = arrayList;
            }
            return Next.h(gsh0.a(gsh0Var, 0, list, false, xrh0Var.b, (List) null, false, false, (p8i0) null, 2033));
        }
        if (zrh0Var instanceof urh0) {
            return Next.h(gsh0.a(gsh0Var, 0, (List) null, false, false, (List) null, false, false, (p8i0) null, 2035));
        }
        if (zrh0Var instanceof vrh0) {
            return (z2 || !gsh0Var.d) ? Next.j() : Next.i(gsh0.a(gsh0Var, 0, (List) null, true, false, (List) null, false, false, (p8i0) null, 2043), Collections.singleton(new jrh0(p8i0Var, list2.size())));
        }
        if (zrh0Var instanceof mrh0) {
            return Next.a(Collections.singleton(new hrh0(i4 > 0)));
        }
        if (zrh0Var instanceof srh0) {
            return Next.a(Collections.singleton(irh0.a));
        }
        if (zrh0Var instanceof wrh0) {
            return Next.a(Collections.singleton(new grh0(p8i0Var)));
        }
        if (zrh0Var instanceof dsh0) {
            if (i3 == 1 || i3 == 2) {
                return Next.i(gsh0.a(gsh0Var, 0, z6xVar, true, true, z6xVar, false, false, (p8i0) null, 2017), f46.S0(new lrh0[]{new erh0(i4 > 0), new jrh0(p8i0Var, 0)}));
            }
            return Next.a(Collections.singleton(new erh0(i4 > 0)));
        }
        if (zrh0Var instanceof trh0) {
            xoh0 xoh0Var = ((trh0) zrh0Var).a;
            long j2 = xoh0Var.a;
            List list5 = list3;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    if (((xoh0) it.next()).a == j2) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list5) {
                            if (((xoh0) obj4).a != j2) {
                                arrayList2.add(obj4);
                            }
                        }
                        return Next.h(gsh0.a(gsh0Var, 0, (List) null, false, false, arrayList2, false, false, (p8i0) null, 2031));
                    }
                }
            }
            int size = list3.size();
            if (p8i0Var != p8i0.c) {
                i4 = gsh0Var.f;
            }
            return size < i4 ? Next.h(gsh0.a(gsh0Var, 0, (List) null, false, false, o7h.O0(xoh0Var, list3), false, false, (p8i0) null, 2031)) : Next.j();
        }
        if (zrh0Var instanceof esh0) {
            if (list3.isEmpty()) {
                return Next.j();
            }
            List<xoh0> list6 = list3;
            ArrayList arrayList3 = new ArrayList(q7h.U(list6, 10));
            for (xoh0 xoh0Var2 : list6) {
                Uri uri = xoh0Var2.b;
                int iOrdinal = xoh0Var2.f.ordinal();
                if (iOrdinal == 0) {
                    i2 = 1;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 2;
                }
                arrayList3.add(new dth0(i2, uri));
            }
            return Next.a(Collections.singleton(new krh0(arrayList3)));
        }
        if (zrh0Var instanceof bsh0) {
            return Next.a(Collections.singleton(new erh0(i4 > 0)));
        }
        if (zrh0Var instanceof nrh0) {
            return Next.a(Collections.singleton(new frh0(p8i0Var)));
        }
        if (zrh0Var instanceof prh0) {
            return Next.h(gsh0.a(gsh0Var, 0, (List) null, false, false, (List) null, true, false, (p8i0) null, 1791));
        }
        if (zrh0Var instanceof qrh0) {
            return Next.h(gsh0.a(gsh0Var, 0, (List) null, false, false, (List) null, false, true, (p8i0) null, 1535));
        }
        if (zrh0Var instanceof rrh0) {
            return Next.i(gsh0.a(gsh0Var, 0, (List) null, false, false, (List) null, false, false, (p8i0) null, 1791), Collections.singleton(new frh0(p8i0Var)));
        }
        if (zrh0Var instanceof orh0) {
            return Next.h(gsh0.a(gsh0Var, 0, (List) null, false, false, (List) null, false, false, (p8i0) null, 1279));
        }
        if (zrh0Var instanceof yrh0) {
            p8i0 p8i0Var3 = ((yrh0) zrh0Var).a;
            return p8i0Var3 == p8i0Var ? Next.j() : Next.i(gsh0.a(gsh0Var, 0, z6xVar, true, true, z6xVar, false, false, p8i0Var3, 993), Collections.singleton(new jrh0(p8i0Var3, 0)));
        }
        eg.o();
        return null;
    }

    private final Next g(Object obj, Object obj2) {
        long j2;
        u5i0 u5i0Var = (u5i0) obj;
        a5i0 a5i0Var = (m5i0) obj2;
        boolean z2 = u5i0Var.N0;
        v5i0 v5i0Var = u5i0Var.a;
        o5i0 o5i0Var = u5i0Var.e;
        boolean z3 = u5i0Var.Y;
        boolean z4 = u5i0Var.X;
        if (a5i0Var.equals(w4i0.a)) {
            return Next.i(u5i0Var, Collections.singleton(n4i0.a));
        }
        boolean z5 = a5i0Var instanceof i5i0;
        q4i0 q4i0Var = q4i0.a;
        if (z5) {
            i5i0 i5i0Var = (i5i0) a5i0Var;
            long j3 = i5i0Var.b;
            long j4 = i5i0Var.a;
            o5i0 o5i0VarA = o5i0.a(o5i0Var, new uvg1(j4, j3), (u5v) null, 2);
            u5i0 u5i0VarA = u5i0.a(u5i0Var, (v5i0) null, zmo1.m(o5i0VarA, v5i0Var.c), o5i0VarA, false, 0, false, (Bitmap) null, false, (t5i0) null, 1048557);
            if (z4 && u890.j(o5i0Var.a, u5i0VarA.e.a)) {
                return Next.h(u5i0VarA);
            }
            if (!u5i0Var.h && !u5i0Var.i) {
                return Next.h(u5i0VarA);
            }
            r5v r5vVar = o5i0Var.b;
            if (!(r5vVar instanceof r5v)) {
                return zmo1.w(u5i0VarA);
            }
            if (j4 != r5vVar.a.a) {
                j2 = j4;
            }
            if (!z4 && z3) {
                return Next.i(u5i0.a(u5i0VarA, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, (t5i0) null, 1046527), f46.S0(new v4i0[]{new o4i0(j2), q4i0Var}));
            }
            j2 = j3;
            return Next.i(u5i0VarA, Collections.singleton(new o4i0(j2)));
        }
        if ((a5i0Var instanceof y4i0) || (a5i0Var instanceof k5i0)) {
            if ((a5i0Var instanceof k5i0) && !z4) {
                return Next.h(u5i0Var);
            }
            u5i0 u5i0VarA2 = u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, o5i0.a(o5i0Var, (uvg1) null, new r5v(o5i0Var.a), 1), false, 0, false, (Bitmap) null, true, (t5i0) null, 786415);
            if (!z4 || !z3) {
                q4i0Var = null;
            }
            return Next.i(u5i0VarA2, dm61.A0(q4i0Var));
        }
        boolean z6 = a5i0Var instanceof x4i0;
        r4i0 r4i0Var = r4i0.a;
        if (z6 || (a5i0Var instanceof j5i0)) {
            if ((a5i0Var instanceof j5i0) && !z4) {
                return Next.h(u5i0Var);
            }
            r5v r5vVar2 = o5i0Var.b;
            r5v r5vVar3 = r5vVar2 instanceof r5v ? r5vVar2 : null;
            uvg1 uvg1Var = r5vVar3 != null ? r5vVar3.a : null;
            o5i0 o5i0VarA2 = o5i0.a(o5i0Var, (uvg1) null, t5v.a, 1);
            uvg1 uvg1Var2 = uvg1Var;
            u5i0 u5i0VarA3 = u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, o5i0VarA2, false, 0, false, (Bitmap) null, false, (t5i0) null, 655343);
            if (z4 && u890.j(o5i0VarA2.a, uvg1Var2)) {
                return Next.i(u5i0VarA3, dm61.A0((z3 && z2) ? r4i0Var : null));
            }
            return zmo1.w(u5i0VarA3);
        }
        if (a5i0Var instanceof c5i0) {
            return (z4 && z3) ? Next.i(u5i0Var, Collections.singleton(q4i0Var)) : Next.h(u5i0Var);
        }
        if (a5i0Var instanceof a5i0) {
            uvg1 uvg1Var3 = o5i0Var.a;
            return Next.i(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, true, (t5i0) null, 786431), Collections.singleton(new o4i0(uvg1Var3.a + ((long) (a5i0Var.a * uvg1Var3.c)))));
        }
        if (a5i0Var instanceof b5i0) {
            long j5 = (long) (((b5i0) a5i0Var).a * o5i0Var.a.c);
            return Next.i(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, (t5i0) null, 655359), Collections.singleton(new s4i0(j5, z4 && z3)));
        }
        if (a5i0Var instanceof z4i0) {
            return u5i0Var.S0 ? Next.h(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, ((z4i0) a5i0Var).a, false, (t5i0) null, 917503)) : Next.h(u5i0Var);
        }
        if (a5i0Var.equals(f5i0.a)) {
            return z3 ? Next.i(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, (t5i0) null, 1046527), Collections.singleton(q4i0Var)) : Next.i(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, true, 0, false, (Bitmap) null, false, (t5i0) null, 1046527), Collections.singleton(r4i0Var));
        }
        if (a5i0Var.equals(g5i0.a)) {
            return Next.h(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, (t5i0) null, 1046527));
        }
        if (a5i0Var.equals(h5i0.a)) {
            if (u5i0Var.Z != 2) {
                return Next.h(u5i0Var);
            }
            u5i0 u5i0VarA4 = u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 1, false, (Bitmap) null, false, (t5i0) null, 1044479);
            uvg1 uvg1Var4 = o5i0Var.a;
            return Next.i(u5i0VarA4, Collections.singleton(new u4i0(uvg1Var4.a, uvg1Var4.b, z3 && z2)));
        }
        if (a5i0Var.equals(d5i0.a)) {
            u5i0 u5i0VarA5 = u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, true, (Bitmap) null, false, (t5i0) null, 1040383);
            return z3 ? Next.i(u5i0VarA5, Collections.singleton(r4i0Var)) : Next.h(u5i0VarA5);
        }
        if (a5i0Var.equals(e5i0.a)) {
            if (z3) {
                return Next.i(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, z4 ? z3 : false, 0, false, (Bitmap) null, false, (t5i0) null, 1038335), Collections.singleton(q4i0Var));
            }
            return Next.h(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, (t5i0) null, 1040383));
        }
        if (!(a5i0Var instanceof l5i0)) {
            eg.o();
            return null;
        }
        ArrayList<rkk1> arrayList = ((l5i0) a5i0Var).a;
        t5i0 t5i0Var = u5i0Var.T0;
        r5i0 r5i0Var = t5i0Var instanceof r5i0 ? (r5i0) t5i0Var : null;
        if (r5i0Var == null) {
            return Next.h(u5i0Var);
        }
        g7i0 g7i0Var = v5i0Var.g;
        if (g7i0Var == null) {
            return Next.h(u5i0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(r5i0Var.a);
        for (rkk1 rkk1Var : arrayList) {
            cae1 cae1Var = rkk1Var.a;
            Integer num = (Integer) linkedHashMap.get(cae1Var);
            linkedHashMap.put(cae1Var, Integer.valueOf(Math.max(num != null ? num.intValue() : 0, rkk1Var.b)));
        }
        return o7h.c1(linkedHashMap.values()) < 140 ? Next.h(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, new r5i0(sqg0.U(linkedHashMap)), 524287)) : Next.i(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, q5i0.a, 524287), Collections.singleton(new p4i0(u5i0Var.d, g7i0Var)));
    }

    private final Next h(Object obj, Object obj2) {
        ou80 ou80Var;
        w7i0 w7i0Var = (w7i0) obj;
        tq80 tq80Var = (tq80) obj2;
        v7i0 v7i0Var = (v7i0) tq80Var.a;
        if (!(v7i0Var instanceof u7i0)) {
            if (v7i0Var instanceof t7i0) {
                return Next.a(Collections.singleton(new s7i0(((t7i0) v7i0Var).a)));
            }
            eg.o();
            return null;
        }
        q1f1 q1f1Var = w7i0Var.c;
        if (!(q1f1Var instanceof q1f1)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        u3i0 u3i0Var = q1f1Var.a.a;
        tqw tqwVar = tq80Var.b;
        return Next.a(Collections.singleton(new r7i0(u3i0.a(u3i0Var, (String) null, (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a, 27))));
    }

    private final Next i(Object obj, Object obj2) {
        g7j0 g7j0Var = (g7j0) obj;
        y6j0 y6j0Var = (a7j0) obj2;
        if (!(y6j0Var instanceof y6j0)) {
            if (y6j0Var instanceof z6j0) {
                g7j0Var.getClass();
                return Next.h(g7j0.a(g7j0Var, ((z6j0) y6j0Var).a, (e7j0) null, (String) null, (String) null, (String) null, 30));
            }
            eg.o();
            return null;
        }
        g7j0Var.getClass();
        b7j0 b7j0Var = y6j0Var.a;
        g7j0 g7j0VarA = g7j0.a(g7j0Var, (cyo1) null, b7j0Var, (String) null, (String) null, (String) null, 29);
        xj61 xj61Var = new xj61();
        if (b7j0Var instanceof b7j0) {
            MessageResponseToken messageResponseToken = b7j0Var.a;
            String str = g7j0Var.c;
            if (str == null) {
                str = "";
            }
            String str2 = g7j0Var.d;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = g7j0Var.e;
            xj61Var.add(new w6j0(messageResponseToken, str, str2, str3 != null ? str3 : ""));
        }
        return Next.i(g7j0VarA, cwl1.j(xj61Var));
    }

    private final Next j(Object obj, Object obj2) {
        ucj0 ucj0Var = (ucj0) obj;
        pcj0 pcj0Var = (qcj0) obj2;
        if (!(ucj0Var instanceof scj0)) {
            return Next.j();
        }
        boolean z2 = pcj0Var instanceof pcj0;
        rcj0 rcj0Var = rcj0.c;
        rcj0 rcj0Var2 = rcj0.a;
        if (z2) {
            pcj0 pcj0Var2 = pcj0Var;
            c9 c9VarF = mqo1.F(pcj0Var2.a);
            scj0 scj0Var = (scj0) ucj0Var;
            c380 c380VarM = hyo1.m(scj0Var.d, c9VarF);
            int iS = zno1.s(q7h.U(c9VarF, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            ListIterator listIterator = c9VarF.listIterator(0);
            while (listIterator.hasNext()) {
                String str = ((vcj0) listIterator.next()).a.a;
                linkedHashMap.put(str, pcj0Var2.b.contains(str) ? rcj0Var : rcj0Var2);
            }
            return Next.h(scj0.a(scj0Var, c9VarF, c380VarM, null, mqo1.G(linkedHashMap), 2, 9));
        }
        if (pcj0Var.equals(ocj0.a)) {
            return Next.h(scj0.a((scj0) ucj0Var, null, null, null, null, 3, 31));
        }
        if (pcj0Var instanceof jcj0) {
            w4i1 w4i1Var = ((jcj0) pcj0Var).a;
            String str2 = w4i1Var.a;
            scj0 scj0Var2 = (scj0) ucj0Var;
            cqs0 cqs0Var = scj0Var2.e;
            return cqs0Var.get(str2) != rcj0Var2 ? Next.j() : Next.i(scj0.a(scj0Var2, null, null, null, cqs0Var.put(str2, rcj0.b), 0, 47), Effects.a(new fcj0[]{new fcj0(str2, w4i1Var.b)}));
        }
        if (pcj0Var instanceof lcj0) {
            scj0 scj0Var3 = (scj0) ucj0Var;
            lcj0 lcj0Var = (lcj0) pcj0Var;
            return Next.i(scj0.a(scj0Var3, null, null, null, scj0Var3.e.put(lcj0Var.a, rcj0Var), 0, 47), Effects.a(new icj0[]{new hcj0(lcj0Var.c, pcf.d(6, lcj0Var.b, (String) null))}));
        }
        if (pcj0Var instanceof kcj0) {
            scj0 scj0Var4 = (scj0) ucj0Var;
            return Next.i(scj0.a(scj0Var4, null, null, null, scj0Var4.e.put(((kcj0) pcj0Var).a, rcj0Var2), 0, 47), Effects.a(new icj0[]{gcj0.a}));
        }
        if (pcj0Var instanceof mcj0) {
            scj0 scj0Var5 = (scj0) ucj0Var;
            String str3 = ((mcj0) pcj0Var).a;
            return Next.h(scj0.a(scj0Var5, null, hyo1.m(str3, scj0Var5.b), str3, null, 0, 51));
        }
        if (pcj0Var.equals(ncj0.a)) {
            return Next.i(ucj0Var, Effects.a(new icj0[]{ecj0.a}));
        }
        eg.o();
        return null;
    }

    private final Next k(Object obj, Object obj2) {
        HashSet hashSetA;
        uz7 uz7Var = (uz7) obj;
        lz7 lz7Var = (lz7) obj2;
        long j2 = uz7Var.g;
        boolean z2 = uz7Var.d;
        boolean z3 = lz7Var instanceof gz7;
        vy7 vy7Var = vy7.b;
        if (z3) {
            uz7 uz7VarA = uz7.a(uz7Var, null, 0L, false, false, true, 0L, 0L, 0L, 239);
            return Next.i(uz7VarA, xto1.x(uz7VarA, vy7Var));
        }
        boolean z4 = lz7Var instanceof hz7;
        sy7 sy7Var = sy7.b;
        if (z4) {
            return Next.i(uz7.a(uz7Var, null, 0L, false, false, false, 0L, 0L, 0L, 239), Effects.a(new sy7[]{sy7Var}));
        }
        boolean z5 = lz7Var instanceof jz7;
        ry7 ry7Var = ry7.b;
        if (z5) {
            return Next.a(Effects.a(new ry7[]{ry7Var}));
        }
        if (!(lz7Var instanceof iz7)) {
            if (!(lz7Var instanceof kz7)) {
                eg.o();
                return null;
            }
            kz7 kz7Var = (kz7) lz7Var;
            if (uz7Var.f > 0) {
                return Next.j();
            }
            uz7 uz7VarA2 = uz7.a(uz7Var, null, kz7Var.b, false, false, false, kz7Var.a, 0L, 0L, 221);
            return Next.i(uz7VarA2, xto1.x(uz7VarA2, vy7Var));
        }
        iz7 iz7Var = (iz7) lz7Var;
        rgt0 rgt0Var = iz7Var.a;
        long j3 = iz7Var.b;
        if (rgt0Var instanceof mgt0) {
            mgt0 mgt0Var = (mgt0) rgt0Var;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!uz7Var.e) {
                linkedHashSet.add(uy7.b);
            }
            linkedHashSet.add(new ty7(mgt0Var.a, mgt0Var.b));
            return Next.i(uz7.a(uz7Var, mgt0Var.a, 0L, mgt0Var.b, false, false, 0L, 0L, 0L, 24), linkedHashSet);
        }
        if (rgt0Var instanceof lgt0) {
            return j2 > 0 ? Next.j() : Next.i(uz7.a(uz7Var, null, 0L, false, false, false, 0L, j3, 0L, 191), Effects.a(new sy7[]{sy7Var}));
        }
        if (rgt0Var instanceof ngt0) {
            if (!(j2 > 0)) {
                return Next.j();
            }
            uz7 uz7VarA3 = uz7.a(uz7Var, null, 0L, false, false, false, 0L, 0L, uz7Var.h + (j2 > 0 ? j3 - j2 : 0L), 63);
            return Next.i(uz7VarA3, xto1.x(uz7VarA3, vy7Var));
        }
        if (rgt0Var instanceof jgt0) {
            return z2 ? Next.j() : Next.i(uz7.a(uz7Var, null, 0L, false, true, false, 0L, 0L, 0L, 247), Effects.a(new sy7[]{sy7Var}));
        }
        if (!(rgt0Var instanceof qgt0)) {
            if (rgt0Var instanceof pgt0) {
                return Next.i(uz7.a(uz7Var, null, 0L, false, false, false, 0L, 0L, 0L, 8), dm61.w0(new tto1[]{xy7.b, ry7Var}));
            }
            eg.o();
            return null;
        }
        if (!z2) {
            return Next.j();
        }
        uz7 uz7VarA4 = uz7.a(uz7Var, null, 0L, false, false, false, 0L, 0L, 0L, 247);
        long j4 = uz7VarA4.b;
        if (j4 > 0) {
            long j5 = j3 - uz7VarA4.f;
            long j6 = uz7VarA4.h;
            long j7 = uz7VarA4.g;
            long j8 = j5 - (j6 + (j7 > 0 ? j3 - j7 : 0L));
            if (uz7VarA4.c) {
                j8 %= j4;
            }
            hashSetA = xto1.x(uz7VarA4, new wy7(j8));
        } else {
            hashSetA = Effects.a(new tto1[0]);
        }
        return Next.i(uz7VarA4, hashSetA);
    }

    private final Next l(Object obj, Object obj2) {
        ucm1 ucm1Var = (ucm1) obj;
        qcm1 qcm1Var = (qcm1) obj2;
        vcf vcfVar = ucm1Var.a;
        boolean z2 = qcm1Var instanceof ncm1;
        scf scfVar = scf.a;
        String strA = null;
        if (z2) {
            hcm0 hcm0Var = ((ncm1) qcm1Var).a;
            if (hcm0Var instanceof hcm0) {
                return Next.a(Collections.singleton(new hcm1(hcm0Var.a)));
            }
            if (hcm0Var instanceof ocm0) {
                String str = ((ocm0) hcm0Var).a;
                if (!(vcfVar instanceof scf)) {
                    if (!(vcfVar instanceof rcf)) {
                        eg.o();
                        return null;
                    }
                    strA = ((rcf) vcfVar).a();
                }
                return u890.j(strA, str) ? Next.j() : Next.i(ucm1.a(ucm1Var, new ucf(str), 2), Collections.singleton(new gcm1(str)));
            }
            if (hcm0Var instanceof pcm0) {
                if (vcfVar instanceof scf) {
                    return Next.j();
                }
                if (vcfVar instanceof rcf) {
                    return Next.i(ucm1.a(ucm1Var, scfVar, 2), Collections.singleton(new gcm1((String) null)));
                }
                eg.o();
                return null;
            }
            if (hcm0Var instanceof kcm0) {
                return Next.a(Collections.singleton(new icm1(((kcm0) hcm0Var).a)));
            }
            if (hcm0Var instanceof lcm0) {
                return Next.i(ucm1.a(ucm1Var, null, 1), Collections.singleton(kcm1.e));
            }
            eg.o();
            return null;
        }
        if (qcm1Var instanceof pcm1) {
            if (vcfVar instanceof scf) {
                return Next.j();
            }
            if (vcfVar instanceof ucf) {
                return Next.a(Collections.singleton(new jcm1(new edm0(((ucf) vcfVar).a))));
            }
            if (vcfVar instanceof tcf) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (!(qcm1Var instanceof mcm1)) {
            if (!(qcm1Var instanceof ocm1)) {
                if (qcm1Var instanceof lcm1) {
                    return Next.a(Collections.singleton(new jcm1(((lcm1) qcm1Var).a)));
                }
                eg.o();
                return null;
            }
            if (vcfVar instanceof scf) {
                return Next.j();
            }
            if (vcfVar instanceof rcf) {
                return Next.i(ucm1.a(ucm1Var, scfVar, 2), f46.S0(new hon1[]{new gcm1((String) null), new jcm1(bdm0.a)}));
            }
            eg.o();
            return null;
        }
        ArrayList arrayList = ((mcm1) qcm1Var).a;
        if (vcfVar instanceof scf) {
            return Next.j();
        }
        if (vcfVar instanceof ucf) {
            String str2 = ((ucf) vcfVar).a;
            return Next.i(ucm1.a(ucm1Var, new tcf(str2, arrayList), 2), Collections.singleton(new jcm1(new xcm0(str2, o7h.T0(o7h.d1(arrayList, 5))))));
        }
        if (!(vcfVar instanceof tcf)) {
            eg.o();
            return null;
        }
        tcf tcfVar = (tcf) vcfVar;
        String str3 = tcfVar.a;
        ucm1 ucm1VarA = ucm1.a(ucm1Var, new tcf(str3, arrayList), 2);
        List list = tcfVar.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jbf) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!setP1.contains(((jbf) obj3).a)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new jcm1(new adm0(str3, (jbf) it2.next())));
        }
        return Next.i(ucm1VarA, o7h.p1(arrayList4));
    }

    private final Next m(Object obj, Object obj2) {
        h7n0 h7n0Var = (h7n0) obj;
        y6n0 y6n0Var = (c7n0) obj2;
        if (y6n0Var instanceof y6n0) {
            if (!(h7n0Var instanceof g7n0)) {
                bhn0.s(h7n0Var, "State is ");
                return null;
            }
            y6n0 y6n0Var2 = y6n0Var;
            g7n0 g7n0Var = (g7n0) h7n0Var;
            return Next.h(new f7n0(g7n0Var.b, g7n0Var.c, g7n0Var.a, (wkt) null, y6n0Var2.a, y6n0Var2.b));
        }
        if (y6n0Var instanceof z6n0) {
            z6n0 z6n0Var = (z6n0) y6n0Var;
            return Next.h(new e7n0(h7n0Var.h(), h7n0Var.b(), h7n0Var.a(), (wkt) null, z6n0Var.d, z6n0Var.e));
        }
        if (y6n0Var instanceof a7n0) {
            a7n0 a7n0Var = (a7n0) y6n0Var;
            u771 u771Var = a7n0Var.b;
            ela1 ela1Var = a7n0Var.a;
            int i2 = a7n0Var.c;
            return Next.i(new g7n0(ela1Var, u771Var, i2, null), Collections.singleton(new p6n0(ela1Var, u771Var, i2, true)));
        }
        if (y6n0Var instanceof b7n0) {
            return Next.h(w6n0.a(h7n0Var, ((b7n0) y6n0Var).a));
        }
        if (y6n0Var instanceof x6n0) {
            x6n0 x6n0Var = (x6n0) y6n0Var;
            return Next.i(w6n0.a(h7n0Var, (wkt) null), Collections.singleton(new q6n0(h7n0Var, x6n0Var.a, x6n0Var.b, x6n0Var.c, x6n0Var.d)));
        }
        eg.o();
        return null;
    }

    private final Next n(Object obj, Object obj2) {
        mq70 mq70Var;
        pp70 pp70Var;
        mq70 mq70Var2;
        up70 up70VarA;
        String str;
        rbn0 rbn0Var = (rbn0) obj;
        lbn0 lbn0Var = (lbn0) obj2;
        u7h u7hVar = null;
        if (!(lbn0Var instanceof jbn0)) {
            if (lbn0Var.equals(ibn0.a)) {
                return Next.h(rbn0.a(rbn0Var, false, mbn0.a, 3));
            }
            if (lbn0Var.equals(kbn0.a)) {
                return Next.i(rbn0.a(rbn0Var, false, obn0.a, 3), Collections.singleton(new hbn0(new bbn0(rbn0Var.a, rbn0Var.b))));
            }
            eg.o();
            return null;
        }
        qbn0 qbn0Var = ((jbn0) lbn0Var).a;
        xkk1 xkk1Var = qbn0Var.b;
        String str2 = (xkk1Var == null || (mq70Var2 = xkk1Var.b) == null || (up70VarA = mq70Var2.a(vp70.d)) == null || (str = up70VarA.a.a) == null || ihc1.y0(str)) ? null : str;
        jo70 jo70Var = qbn0Var.a;
        String str3 = jo70Var.a;
        String strA = m0p1.A(jo70Var);
        if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (pp70Var = mq70Var.b) != null) {
            u7hVar = new u7h(pp70Var.b.a.c);
        }
        return Next.h(rbn0.a(rbn0Var, false, new nbn0(str3, strA, str2, u7hVar, qbn0Var.c), 3));
    }

    private final Next o(Object obj, Object obj2) {
        k0o0 k0o0Var = (k0o0) obj;
        j0o0 j0o0Var = (j0o0) obj2;
        boolean z2 = k0o0Var.a;
        Set set = k0o0Var.c;
        uuf sufVar = k0o0Var.f;
        Set set2 = k0o0Var.b;
        if (j0o0Var instanceof c0o0) {
            c0o0 c0o0Var = (c0o0) j0o0Var;
            boolean z3 = c0o0Var.a;
            if (z2 == z3) {
                return Next.j();
            }
            k0o0 k0o0VarA = k0o0.a(k0o0Var, z3, null, null, null, false, null, 62);
            return c0o0Var.a ? xzn1.I(k0o0VarA) : Next.h(k0o0VarA);
        }
        boolean z4 = j0o0Var instanceof e0o0;
        uuf uufVar = ruf.a;
        if (z4) {
            return !u890.j(sufVar, new suf(((e0o0) j0o0Var).a)) ? Next.j() : xzn1.I(k0o0.a(k0o0Var, false, null, null, null, false, uufVar, 31));
        }
        if (j0o0Var instanceof d0o0) {
            Set setV0 = dm61.v0(((d0o0) j0o0Var).a, set);
            Set setV1 = dm61.v0(setV0, set2);
            if (setV1.isEmpty()) {
                return !dm61.v0(set2, setV0).isEmpty() ? Next.h(k0o0.a(k0o0Var, false, setV0, null, null, false, null, 61)) : Next.j();
            }
            return Next.i(k0o0.a(k0o0Var, false, setV0, null, null, false, null, 61), Collections.singleton(new wzn0(setV1)));
        }
        if (!(j0o0Var instanceof g0o0)) {
            if (j0o0Var instanceof h0o0) {
                String str = ((h0o0) j0o0Var).a;
                return Next.h(k0o0.a(k0o0Var, false, dm61.u0(str, set2), dm61.x0(str, set), null, false, null, 57));
            }
            if (j0o0Var instanceof f0o0) {
                String str2 = ((f0o0) j0o0Var).a;
                return !set2.contains(str2) ? Next.j() : Next.h(k0o0.a(k0o0Var, false, dm61.u0(str2, set2), null, null, false, null, 61));
            }
            if (!(j0o0Var instanceof i0o0)) {
                eg.o();
                return null;
            }
            i0o0 i0o0Var = (i0o0) j0o0Var;
            boolean z5 = sufVar instanceof suf;
            if (!i0o0Var.b) {
                if (z5) {
                }
                return xzn1.I(k0o0.a(k0o0Var, false, null, null, null, i0o0Var.a, uufVar, 15));
            }
            sufVar = tuf.a;
            uufVar = sufVar;
            return xzn1.I(k0o0.a(k0o0Var, false, null, null, null, i0o0Var.a, uufVar, 15));
        }
        cv21 cv21Var = ((g0o0) j0o0Var).a;
        String str3 = cv21Var.a;
        if (!set2.contains(str3) || set.contains(str3)) {
            return Next.j();
        }
        boolean z6 = z2 && !k0o0Var.e && u890.j(sufVar, uufVar);
        LinkedHashSet linkedHashSetU0 = dm61.u0(str3, set2);
        LinkedHashSet linkedHashSetX0 = dm61.x0(str3, set);
        List listO0 = k0o0Var.d;
        if (!z6) {
            listO0 = o7h.O0(cv21Var, listO0);
        }
        if (z6) {
            sufVar = new suf(str3);
        }
        k0o0 k0o0VarA2 = k0o0.a(k0o0Var, false, linkedHashSetU0, linkedHashSetX0, listO0, false, sufVar, 17);
        xj61 xj61Var = new xj61();
        if (z6) {
            xj61Var.add(new vzn0(cv21Var));
        }
        return Next.i(k0o0VarA2, cwl1.j(xj61Var));
    }

    private final Next p(Object obj, Object obj2) {
        boo0 boo0Var = (boo0) obj;
        fmo0 fmo0Var = (fmo0) obj2;
        if (u890.j(fmo0Var, fmo0.b)) {
            boo0Var.getClass();
            return Next.h(new boo0(zno0.a));
        }
        if (u890.j(fmo0Var, fmo0.a)) {
            boo0Var.getClass();
            return Next.h(new boo0(yno0.a));
        }
        if (u890.j(fmo0Var, fmo0.d)) {
            return Next.a(Collections.singleton(rlo0.a));
        }
        if (u890.j(fmo0Var, fmo0.c)) {
            return Next.a(Collections.singleton(qlo0.a));
        }
        if (u890.j(fmo0Var, fmo0.e)) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    public final Next a(Object obj, Object obj2) {
        Next nextH;
        boolean z2;
        aeg0 aeg0Var;
        boolean z3;
        switch (this.a) {
            case 0:
                eyb0 eyb0Var = (eyb0) obj;
                j01 j01Var = (zxb0) obj2;
                vxb0 vxb0Var = eyb0Var.a;
                dyb0 dyb0Var = eyb0Var.h;
                if (j01Var instanceof j01) {
                    j01 j01Var2 = j01Var;
                    return Next.a(Effects.a(new jgv0[]{new jgv0(j01Var2.b, dyb0Var.a, vxb0Var.a, j01Var2.a)}));
                }
                if (j01Var instanceof ik51) {
                    return Next.a(Effects.a(new ujb0[]{new ujb0(eyb0Var)}));
                }
                if (j01Var instanceof lk51) {
                    return Next.j();
                }
                if (j01Var instanceof n8h) {
                    return Next.h(new eyb0(vxb0Var, eyb0Var.b, ((n8h) j01Var).a, eyb0Var.d, eyb0Var.e, eyb0Var.f, eyb0Var.g, dyb0Var));
                }
                eg.o();
                return null;
            case 1:
                ccd0 ccd0Var = (ccd0) obj;
                boolean z4 = ccd0Var.d;
                List list = ccd0Var.a;
                boolean z5 = ccd0Var.g;
                axd axdVar = (vbd0) ((tq80) obj2).a;
                boolean z6 = axdVar instanceof axd;
                jbd0 jbd0Var = jbd0.a;
                rbd0 rbd0Var = rbd0.a;
                if (z6) {
                    smc0 smc0VarN = k4p1.n();
                    if (jm5.n(ccd0Var) && z5) {
                        smc0VarN.add(rbd0Var);
                    }
                    smc0VarN.add(sbd0.a);
                    smc0VarN.addAll(axdVar.a);
                    if (jm5.n(ccd0Var) && !z5) {
                        smc0VarN.add(rbd0Var);
                    }
                    if (!ccd0Var.f && z4) {
                        smc0VarN.add(jbd0Var);
                    }
                    return Next.h(ccd0.a(ccd0Var, k4p1.k(smc0VarN), xbd0.a, ccd0Var.c + 1, false, (Set) null, 120));
                }
                if (!(axdVar instanceof o7j0)) {
                    if (!(axdVar instanceof zwd)) {
                        return axdVar instanceof mc31 ? Next.i(ccd0.a(ccd0Var, (List) null, ybd0.a, 0L, false, (Set) null, 125), Collections.singleton(new fbw(ccd0Var.e))) : Next.j();
                    }
                    ndg0 ndg0Var = ccd0Var.b;
                    ndg0 ndg0Var2 = ndg0Var instanceof zbd0 ? (zbd0) ndg0Var : null;
                    int i2 = ndg0Var2 != null ? ((zbd0) ndg0Var2).a : 0;
                    boolean zIsEmpty = list.isEmpty();
                    z6x z6xVar = z6x.a;
                    wbd0 wbd0Var = wbd0.a;
                    if (zIsEmpty) {
                        Logger.d(l1d.m("ListeningActivityCarousel: Carousel initial load failed: ", ((zwd) axdVar).a.getMessage()), new Object[0]);
                        return Next.h(ccd0.a(ccd0Var, z6xVar, wbd0Var, 0L, false, (Set) null, 124));
                    }
                    if (i2 >= 10) {
                        Logger.d(ab80.n("ListeningActivityCarousel: Carousel refresh failed ", " consecutive times, with error ", i2, ((zwd) axdVar).a.getMessage()), new Object[0]);
                        return Next.h(ccd0.a(ccd0Var, z6xVar, wbd0Var, 0L, false, (Set) null, 124));
                    }
                    int i3 = i2 + 1;
                    Logger.k(ab80.n("ListeningActivityCarousel: Carousel refresh failed (", "/10), showing stale data: ", i3, ((zwd) axdVar).a.getMessage()), new Object[0]);
                    return Next.h(ccd0.a(ccd0Var, (List) null, new zbd0(i3), 0L, false, (Set) null, 125));
                }
                boolean z7 = ((o7j0) axdVar).a;
                if (z7 == z4) {
                    return Next.j();
                }
                ccd0 ccd0VarA = ccd0.a(ccd0Var, (List) null, (acd0) null, 0L, z7, (Set) null, 119);
                boolean z8 = ccd0VarA.g;
                smc0 smc0VarN2 = k4p1.n();
                if (jm5.n(ccd0VarA) && z8) {
                    smc0VarN2.add(rbd0Var);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    tbd0 tbd0Var = (tbd0) obj3;
                    if (!(tbd0Var instanceof jbd0) && !(tbd0Var instanceof rbd0)) {
                        arrayList.add(obj3);
                    }
                }
                smc0VarN2.addAll(arrayList);
                if (jm5.n(ccd0VarA) && !z8) {
                    smc0VarN2.add(rbd0Var);
                }
                if (!ccd0VarA.f && ccd0VarA.d) {
                    smc0VarN2.add(jbd0Var);
                }
                return Next.h(ccd0.a(ccd0VarA, k4p1.k(smc0VarN2), (acd0) null, 0L, false, (Set) null, 126));
            case 2:
                are0 are0Var = (are0) obj;
                nqe0 nqe0Var = (qqe0) obj2;
                t3k1 t3k1Var = are0Var.b;
                Map map = are0Var.c;
                if (nqe0Var instanceof jqe0) {
                    moe0 moe0Var = (moe0) map.get(k50.c);
                    are0 are0VarJ = oap1.j(are0Var);
                    if (moe0Var == null) {
                        return !(t3k1Var instanceof jwq0) ? Next.h(are0VarJ) : Next.j();
                    }
                    mmr0 mmr0VarE = oap1.E(are0VarJ, moe0Var);
                    return Next.i((are0) mmr0VarE.a, (Set) mmr0VarE.b);
                }
                boolean z9 = nqe0Var instanceof pqe0;
                mpe0 mpe0Var = mpe0.a;
                if (z9) {
                    return Next.a(Collections.singleton(mpe0Var));
                }
                if (nqe0Var instanceof oqe0) {
                    return Next.a(Collections.singleton(qpe0.a));
                }
                if (nqe0Var instanceof nqe0) {
                    xoe0 xoe0Var = nqe0Var.a;
                    return Next.h(new are0(xoe0Var, jwq0.b, fap1.e(xoe0Var)));
                }
                if (nqe0Var instanceof mqe0) {
                    return Next.a(Collections.singleton(mpe0Var));
                }
                if (nqe0Var instanceof iqe0) {
                    moe0 moe0Var2 = (moe0) map.get(((iqe0) nqe0Var).a);
                    are0 are0VarJ2 = oap1.j(are0Var);
                    if (moe0Var2 != null) {
                        mmr0 mmr0VarE2 = oap1.E(are0VarJ2, moe0Var2);
                        nextH = Next.i((are0) mmr0VarE2.a, (Set) mmr0VarE2.b);
                    } else {
                        nextH = !(t3k1Var instanceof jwq0) ? Next.h(are0VarJ2) : Next.j();
                    }
                    return nextH;
                }
                if (nqe0Var instanceof lqe0) {
                    moe0 moe0Var3 = ((lqe0) nqe0Var).a;
                    hap1.e(moe0Var3);
                    return oap1.F(are0Var, moe0Var3);
                }
                if (!(nqe0Var instanceof kqe0)) {
                    eg.o();
                    return null;
                }
                kqe0 kqe0Var = (kqe0) nqe0Var;
                moe0 moe0Var4 = kqe0Var.a;
                hap1.e(moe0Var4);
                are0 are0VarJ3 = oap1.j(are0Var);
                Next nextF = oap1.F(are0VarJ3, moe0Var4);
                rpe0 rpe0Var = new rpe0(kqe0Var.b);
                if (nextF.d() && nextF.c()) {
                    return Next.i(nextF.g(), dm61.x0(rpe0Var, nextF.b()));
                }
                if (nextF.d()) {
                    return Next.i(nextF.g(), Collections.singleton(rpe0Var));
                }
                return nextF.c() ? Next.i(are0VarJ3, dm61.x0(rpe0Var, nextF.b())) : Next.i(are0VarJ3, Collections.singleton(rpe0Var));
            case 3:
                elv0 elv0Var = (elv0) obj;
                ykv0 ykv0Var = (clv0) obj2;
                if (ykv0Var instanceof ykv0) {
                    return Next.h(new elv0(sqg0.O(elv0Var.a, ykv0Var.a)));
                }
                if (!(ykv0Var instanceof ukv0)) {
                    if (ykv0Var instanceof wkv0) {
                        return Next.a(Collections.singleton(new xjv0(((wkv0) ykv0Var).a)));
                    }
                    if (ykv0Var instanceof alv0) {
                        return Next.a(Collections.singleton(new zjv0(((alv0) ykv0Var).a)));
                    }
                    eg.o();
                    return null;
                }
                Map map2 = elv0Var.a;
                Set set = ((ukv0) ykv0Var).a;
                Set set2 = set;
                int iS = zno1.s(q7h.U(set2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj4 : set2) {
                    linkedHashMap.put(obj4, Boolean.FALSE);
                }
                return Next.i(new elv0(sqg0.O(map2, linkedHashMap)), Collections.singleton(new vjv0(set)));
            case 4:
                whx0 whx0Var = (whx0) obj;
                zgx0 zgx0Var = (ahx0) obj2;
                if (zgx0Var instanceof zgx0) {
                    return Next.h(new whx0(sqg0.O(whx0Var.a, zgx0Var.a)));
                }
                if (!(zgx0Var instanceof ygx0)) {
                    eg.o();
                    return null;
                }
                Map map3 = whx0Var.a;
                Set set3 = ((ygx0) zgx0Var).a;
                Set set4 = set3;
                int iS2 = zno1.s(q7h.U(set4, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj5 : set4) {
                    linkedHashMap2.put(obj5, new hix0(false, 0L));
                }
                return Next.i(new whx0(sqg0.O(linkedHashMap2, map3)), Collections.singleton(new jgx0(set3)));
            case 5:
                return k4k.x((xnb1) obj, (y500) obj2);
            case 6:
                return k4k.x((xnb1) obj, (y500) obj2);
            case 7:
                zaf0 zaf0Var = (zaf0) obj;
                jaf0 jaf0Var = (xaf0) obj2;
                if (jaf0Var instanceof jaf0) {
                    return Next.h(zaf0.a(zaf0Var, jaf0Var.a ? ual.a : ual.b, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, false, false, false, 32766));
                }
                if (jaf0Var instanceof vaf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, ((vaf0) jaf0Var).a, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, false, false, false, 32751));
                }
                if (jaf0Var instanceof caf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, ((caf0) jaf0Var).a, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, false, false, false, 32759));
                }
                if (jaf0Var instanceof laf0) {
                    return Next.a(Collections.singleton(new y9f0(((laf0) jaf0Var).a)));
                }
                if (jaf0Var instanceof faf0) {
                    return Next.a(Collections.singleton(new y9f0(((faf0) jaf0Var).a)));
                }
                if (jaf0Var instanceof paf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, ((paf0) jaf0Var).a, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, false, false, false, 32765));
                }
                if (jaf0Var instanceof gaf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, ((gaf0) jaf0Var).a, (u6o0) null, (Boolean) null, false, false, false, false, false, false, false, 32735));
                }
                if (jaf0Var.equals(haf0.a)) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, false, false, false, 32735));
                }
                if (jaf0Var instanceof uaf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, ((uaf0) jaf0Var).a ? u6o0.a : u6o0.b, (Boolean) null, false, false, false, false, false, false, false, 32703));
                }
                if (jaf0Var instanceof maf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, Boolean.valueOf(((maf0) jaf0Var).a), false, false, false, false, false, false, false, 32639));
                }
                if (jaf0Var instanceof naf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, ((naf0) jaf0Var).a, false, false, false, false, false, false, 32511));
                }
                if (jaf0Var instanceof waf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, ((waf0) jaf0Var).a, false, false, false, false, false, 32255));
                }
                if (jaf0Var instanceof iaf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, ((iaf0) jaf0Var).a, false, false, false, false, 31743));
                }
                if (jaf0Var instanceof oaf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, ((oaf0) jaf0Var).a, false, false, false, 30719));
                }
                if (jaf0Var instanceof kaf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, ((kaf0) jaf0Var).a, false, false, 28671));
                }
                if (jaf0Var instanceof daf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, false, ((daf0) jaf0Var).a, false, 24575));
                }
                if (jaf0Var instanceof eaf0) {
                    return Next.h(zaf0.a(zaf0Var, (ual) null, false, (xa0) null, (vdu0) null, (igb) null, (u6o0) null, (Boolean) null, false, false, false, false, false, false, ((eaf0) jaf0Var).a, 16383));
                }
                if (jaf0Var instanceof raf0) {
                    return Next.a(Collections.singleton(new y9f0(((raf0) jaf0Var).a)));
                }
                if (jaf0Var instanceof taf0) {
                    return Next.a(Collections.singleton(new y9f0(((taf0) jaf0Var).a)));
                }
                if (jaf0Var instanceof saf0) {
                    return Next.a(Collections.singleton(new y9f0(((saf0) jaf0Var).a)));
                }
                if (jaf0Var instanceof qaf0) {
                    return Next.a(Collections.singleton(new y9f0(((qaf0) jaf0Var).a)));
                }
                eg.o();
                return null;
            case 8:
                tef0 tef0Var = (tef0) obj;
                tq80 tq80Var = (tq80) obj2;
                ndg0 ndg0Var3 = tef0Var.i;
                boolean z10 = tef0Var.h;
                String str = tef0Var.b;
                String str2 = tef0Var.c;
                nef0 nef0Var = (ref0) tq80Var.a;
                if (nef0Var instanceof lef0) {
                    tqw tqwVar = tq80Var.b;
                    if (tef0Var.a.a.h != 1) {
                        return Next.j();
                    }
                    dof1 dof1Var = new dof1(tef0Var.e, tef0Var.d, tef0Var.f, str);
                    if (tqwVar != null) {
                        return Next.a(Collections.singleton(new ief0(dof1Var, str2, n3o1.y(tqwVar))));
                    }
                    hhg1.n("Required value was null.");
                    return null;
                }
                if (nef0Var instanceof nef0) {
                    nef0 nef0Var2 = nef0Var;
                    boolean z11 = nef0Var2.a;
                    if (z11 == z10) {
                        return Next.j();
                    }
                    tef0 tef0VarA = tef0.a(tef0Var, (a9h) null, (String) null, z11, (String) null, 383);
                    if (ndg0Var3 == null) {
                        return Next.h(tef0VarA);
                    }
                    return Next.i(tef0VarA, Collections.singleton(new jef0(str, str2, nef0Var2.a ? ndg0Var3 : null)));
                }
                if (nef0Var instanceof mef0) {
                    String str3 = ((mef0) nef0Var).a;
                    return !str3.equals(str2) ? Next.h(tef0.a(tef0Var, (a9h) null, str3, false, (String) null, 507)) : Next.j();
                }
                if (!(nef0Var instanceof qef0)) {
                    if (nef0Var instanceof pef0) {
                        return Next.h(tef0.a(tef0Var, ((pef0) nef0Var).a, (String) null, false, (String) null, 510));
                    }
                    if (nef0Var instanceof oef0) {
                        return Next.j();
                    }
                    eg.o();
                    return null;
                }
                qef0 qef0Var = (qef0) nef0Var;
                String str4 = qef0Var.a;
                if (u890.j(str4, ndg0Var3)) {
                    return Next.j();
                }
                String str5 = qef0Var.a;
                if (str5 == null && qef0Var.b) {
                    return Next.h(tef0.a(tef0Var, (a9h) null, (String) null, false, (String) null, 255));
                }
                return !z10 ? Next.h(tef0.a(tef0Var, (a9h) null, (String) null, false, str5, 255)) : Next.i(tef0.a(tef0Var, (a9h) null, (String) null, false, str5, 255), Collections.singleton(new jef0(str, str2, str4)));
            case 9:
                jgf0 jgf0Var = (jgf0) obj;
                hgf0 hgf0Var = (igf0) obj2;
                if (hgf0Var instanceof hgf0) {
                    return Next.a(Collections.singleton(new egf0(hgf0Var.a.a)));
                }
                if (!(hgf0Var instanceof fgf0)) {
                    if (hgf0Var instanceof ggf0) {
                        cay cayVar = ((ggf0) hgf0Var).a;
                        return Next.i(jgf0.a(jgf0Var, cayVar.a), Collections.singleton(new egf0(cayVar)));
                    }
                    eg.o();
                    return null;
                }
                q1f1 q1f1Var = jgf0Var.c;
                if (!(q1f1Var instanceof q1f1)) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                cgf0 cgf0Var = q1f1Var.a;
                String str6 = cgf0Var.b;
                long j2 = jgf0Var.f;
                String str7 = jgf0Var.g;
                if (str7 != null) {
                    return Next.a(Collections.singleton(new dgf0(j2, str6, str7, cgf0Var.c)));
                }
                eg.m("Required value was null.");
                return null;
            case 10:
                return c(obj, obj2);
            case 11:
                rnf0 rnf0Var = (rnf0) obj;
                w400 w400Var = (v600) obj2;
                vef0 vef0Var = rnf0Var.d;
                if (w400Var instanceof w400) {
                    return Next.h(rnf0.a(rnf0Var, (kw9) null, (vef0) null, 0, (ez61) null, (String) null, (ArrayList) null, (String) null, w400Var.a, 511));
                }
                if (w400Var instanceof k300) {
                    k300 k300Var = (k300) w400Var;
                    return Next.i(rnf0.a(rnf0Var, (kw9) null, (vef0) null, 0, (ez61) null, (String) null, (ArrayList) null, (String) null, (wkt) null, 511), Collections.singleton(new pdw(rnf0Var, k300Var.a, k300Var.b)));
                }
                if (!(w400Var instanceof myz)) {
                    if (w400Var instanceof x400) {
                        x400 x400Var = (x400) w400Var;
                        return Next.a(Collections.singleton(new kcw(rnf0Var, x400Var.a, x400Var.b, x400Var.c)));
                    }
                    eg.o();
                    return null;
                }
                myz myzVar = (myz) w400Var;
                String str8 = myzVar.a;
                kw9 kw9Var = myzVar.b;
                String str9 = myzVar.h;
                ArrayList arrayList2 = myzVar.i;
                cqs0 cqs0Var = myzVar.c;
                rnf0 rnf0VarA = rnf0.a(rnf0Var, kw9Var, vef0.a(vef0Var, cqs0Var, myzVar.d, 0, 0, myzVar.f, myzVar.e, myzVar.g, u890.j(cqs0Var, vef0Var.d) ? vef0Var.Y : fg91.b, 12519), 0, (ez61) null, str9, arrayList2, str8, (wkt) null, 566);
                return Next.i(rnf0VarA, Collections.singleton(vby0.A(rnf0VarA)));
            case 12:
                return d(obj, obj2);
            case 13:
                xag0 xag0Var = (xag0) obj;
                vag0 vag0Var = (vag0) obj2;
                String str10 = xag0Var.a;
                ndg0 ndg0Var4 = xag0Var.h;
                if (vag0Var instanceof pag0) {
                    return Next.i(xag0.a(xag0Var, ndg0Var4 != null ? ndg0.a(ndg0Var4, ((pag0) vag0Var).a, false, 6) : null, 1919), Collections.singleton(new cag0(str10, ((pag0) vag0Var).a)));
                }
                if (vag0Var instanceof oag0) {
                    return Next.h(xag0.a(xag0Var, ndg0Var4 != null ? ndg0.a(ndg0Var4, ((oag0) vag0Var).a, false, 6) : null, 1919));
                }
                boolean z12 = vag0Var instanceof qag0;
                bag0 bag0Var = bag0.c;
                if (z12) {
                    return Next.i(xag0.a(xag0Var, ndg0Var4 != null ? ndg0.a(ndg0Var4, ((qag0) vag0Var).a, false, 6) : null, 1919), Collections.singleton(bag0Var));
                }
                if (vag0Var instanceof tag0) {
                    return Next.i(xag0.a(xag0Var, ndg0Var4 != null ? ndg0.a(ndg0Var4, false, ((tag0) vag0Var).a, 5) : null, 1919), Collections.singleton(new dag0(str10, ((tag0) vag0Var).a)));
                }
                if (vag0Var instanceof sag0) {
                    return Next.h(xag0.a(xag0Var, ndg0Var4 != null ? ndg0.a(ndg0Var4, false, ((sag0) vag0Var).a, 5) : null, 1919));
                }
                if (vag0Var instanceof uag0) {
                    return Next.i(xag0.a(xag0Var, ndg0Var4 != null ? ndg0.a(ndg0Var4, false, ((uag0) vag0Var).a, 5) : null, 1919), Collections.singleton(bag0Var));
                }
                if (vag0Var instanceof nag0) {
                    return Next.a(Collections.singleton(aag0.c));
                }
                if (vag0Var instanceof rag0) {
                    return Next.h(xag0.a(xag0Var, (ndg0) null, 1791));
                }
                eg.o();
                return null;
            case 14:
                hdg0 hdg0Var = (hdg0) obj;
                pcg0 pcg0Var = (fdg0) obj2;
                ibg0 ibg0Var = hdg0Var.b;
                String str11 = hdg0Var.a;
                r7g0 r7g0Var = hdg0Var.p;
                s7g0 s7g0Var = hdg0Var.q;
                if (pcg0Var.equals(scg0.a)) {
                    return Next.h(hdg0.a(hdg0Var, (r7g0) null, (s7g0) null, 522239));
                }
                if (pcg0Var.equals(ocg0.a)) {
                    return Next.a(Collections.singleton(obg0.d));
                }
                if (pcg0Var instanceof qcg0) {
                    qcg0 qcg0Var = (qcg0) pcg0Var;
                    if (r7g0Var == null) {
                        return Next.j();
                    }
                    boolean z13 = qcg0Var.a;
                    return Boolean.valueOf(z13).equals(r7g0Var.b) ? Next.j() : Next.i(hdg0.a(hdg0Var, r7g0.a(r7g0Var, Boolean.valueOf(z13), (Boolean) null, 13), (s7g0) null, 491519), Collections.singleton(new qbg0(str11, ibg0Var, z13)));
                }
                if (pcg0Var instanceof pcg0) {
                    return Next.h(hdg0.a(hdg0Var, r7g0Var != null ? r7g0.a(r7g0Var, Boolean.valueOf(pcg0Var.a), (Boolean) null, 13) : null, (s7g0) null, 491519));
                }
                boolean z14 = pcg0Var instanceof rcg0;
                pbg0 pbg0Var = pbg0.d;
                if (z14) {
                    return Next.i(hdg0.a(hdg0Var, r7g0Var != null ? r7g0.a(r7g0Var, Boolean.valueOf(((rcg0) pcg0Var).a), (Boolean) null, 13) : null, (s7g0) null, 491519), Collections.singleton(pbg0Var));
                }
                if (pcg0Var instanceof ddg0) {
                    ddg0 ddg0Var = (ddg0) pcg0Var;
                    if (r7g0Var == null) {
                        return Next.j();
                    }
                    boolean z15 = ddg0Var.a;
                    return Boolean.valueOf(z15).equals(r7g0Var.c) ? Next.j() : Next.i(hdg0.a(hdg0Var, r7g0.a(r7g0Var, (Boolean) null, Boolean.valueOf(z15), 11), (s7g0) null, 491519), Collections.singleton(new ubg0(str11, ibg0Var, z15)));
                }
                if (pcg0Var instanceof cdg0) {
                    return Next.h(hdg0.a(hdg0Var, r7g0Var != null ? r7g0.a(r7g0Var, (Boolean) null, Boolean.valueOf(((cdg0) pcg0Var).a), 11) : null, (s7g0) null, 491519));
                }
                if (pcg0Var instanceof edg0) {
                    return Next.i(hdg0.a(hdg0Var, r7g0Var != null ? r7g0.a(r7g0Var, (Boolean) null, Boolean.valueOf(((edg0) pcg0Var).a), 11) : null, (s7g0) null, 491519), Collections.singleton(pbg0Var));
                }
                if (pcg0Var instanceof adg0) {
                    adg0 adg0Var = (adg0) pcg0Var;
                    if (s7g0Var == null) {
                        return Next.j();
                    }
                    boolean z16 = adg0Var.a;
                    return Boolean.valueOf(z16).equals(s7g0Var.a) ? Next.j() : Next.i(hdg0.a(hdg0Var, (r7g0) null, s7g0.a(s7g0Var, Boolean.valueOf(z16), (Boolean) null, (Boolean) null, 14), 458751), Collections.singleton(new tbg0(str11, ibg0Var, z16)));
                }
                if (pcg0Var instanceof zcg0) {
                    return Next.h(hdg0.a(hdg0Var, (r7g0) null, s7g0Var != null ? s7g0.a(s7g0Var, Boolean.valueOf(((zcg0) pcg0Var).a), (Boolean) null, (Boolean) null, 14) : null, 458751));
                }
                if (pcg0Var instanceof bdg0) {
                    return Next.i(hdg0.a(hdg0Var, (r7g0) null, s7g0Var != null ? s7g0.a(s7g0Var, Boolean.valueOf(((bdg0) pcg0Var).a), (Boolean) null, (Boolean) null, 14) : null, 458751), Collections.singleton(pbg0Var));
                }
                if (pcg0Var instanceof xcg0) {
                    xcg0 xcg0Var = (xcg0) pcg0Var;
                    if (s7g0Var == null) {
                        return Next.j();
                    }
                    boolean z17 = xcg0Var.a;
                    return Boolean.valueOf(z17).equals(s7g0Var.c) ? Next.j() : Next.i(hdg0.a(hdg0Var, (r7g0) null, s7g0.a(s7g0Var, (Boolean) null, Boolean.valueOf(z17), (Boolean) null, 11), 458751), Collections.singleton(new sbg0(str11, ibg0Var, z17)));
                }
                if (pcg0Var instanceof wcg0) {
                    return Next.h(hdg0.a(hdg0Var, (r7g0) null, s7g0Var != null ? s7g0.a(s7g0Var, (Boolean) null, Boolean.valueOf(((wcg0) pcg0Var).a), (Boolean) null, 11) : null, 458751));
                }
                if (pcg0Var instanceof ycg0) {
                    return Next.i(hdg0.a(hdg0Var, (r7g0) null, s7g0Var != null ? s7g0.a(s7g0Var, (Boolean) null, Boolean.valueOf(((ycg0) pcg0Var).a), (Boolean) null, 11) : null, 458751), Collections.singleton(pbg0Var));
                }
                if (pcg0Var instanceof ucg0) {
                    ucg0 ucg0Var = (ucg0) pcg0Var;
                    if (s7g0Var == null) {
                        return Next.j();
                    }
                    boolean z18 = ucg0Var.a;
                    return Boolean.valueOf(z18).equals(s7g0Var.d) ? Next.j() : Next.i(hdg0.a(hdg0Var, (r7g0) null, s7g0.a(s7g0Var, (Boolean) null, (Boolean) null, Boolean.valueOf(z18), 7), 458751), Collections.singleton(new rbg0(str11, ibg0Var, z18)));
                }
                if (pcg0Var instanceof tcg0) {
                    return Next.h(hdg0.a(hdg0Var, (r7g0) null, s7g0Var != null ? s7g0.a(s7g0Var, (Boolean) null, (Boolean) null, Boolean.valueOf(((tcg0) pcg0Var).a), 7) : null, 458751));
                }
                if (pcg0Var instanceof vcg0) {
                    return Next.i(hdg0.a(hdg0Var, (r7g0) null, s7g0Var != null ? s7g0.a(s7g0Var, (Boolean) null, (Boolean) null, Boolean.valueOf(((vcg0) pcg0Var).a), 7) : null, 458751), Collections.singleton(pbg0Var));
                }
                eg.o();
                return null;
            case 15:
                ceg0 ceg0Var = (ceg0) obj;
                aeg0 aeg0Var2 = (beg0) obj2;
                if (aeg0Var2 instanceof aeg0) {
                    if (ceg0Var.d || (z2 = ceg0Var.c) == (z3 = (aeg0Var = aeg0Var2).a)) {
                        return Next.j();
                    }
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    String str12 = ceg0Var.a;
                    ibg0 ibg0Var2 = ceg0Var.b;
                    return Next.i(new ceg0(str12, ibg0Var2, z3, true, boolValueOf), Collections.singleton(new sdg0(str12, ibg0Var2, aeg0Var.a)));
                }
                if (aeg0Var2 instanceof zdg0) {
                    return !ceg0Var.d ? Next.j() : Next.h(new ceg0(ceg0Var.a, ceg0Var.b, ((zdg0) aeg0Var2).a, false, null));
                }
                if (!u890.j(aeg0Var2, ydg0.a)) {
                    eg.o();
                    return null;
                }
                if (!ceg0Var.d) {
                    return Next.j();
                }
                Boolean bool = ceg0Var.e;
                return Next.i(new ceg0(ceg0Var.a, ceg0Var.b, bool != null ? bool.booleanValue() : ceg0Var.c, false, null), Collections.singleton(tdg0.d));
            case 16:
                return e(obj, obj2);
            case 17:
                return f(obj, obj2);
            case 18:
                return g(obj, obj2);
            case 19:
                return h(obj, obj2);
            case 20:
                return i(obj, obj2);
            case 21:
                return j(obj, obj2);
            case 22:
                return k(obj, obj2);
            case 23:
                return l(obj, obj2);
            case 24:
                return m(obj, obj2);
            case 25:
                return n(obj, obj2);
            case 26:
                return o(obj, obj2);
            case 27:
                return u890.j((fmo0) obj2, fmo0.c) ? Next.a(Collections.singleton(m430.a)) : Next.j();
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return p(obj, obj2);
            default:
                return b((q4p0) obj, (q3p0) obj2);
        }
    }

    public Next b(q4p0 q4p0Var, q3p0 q3p0Var) {
        if (q3p0Var instanceof o3p0) {
            return Next.h(q4p0.b(q4p0Var, ((o3p0) q3p0Var).a, false, false, (e090) null, (String) null, (String) null, 62));
        }
        if (q3p0Var instanceof k3p0) {
            return Next.h(q4p0.b(q4p0Var, false, false, ((k3p0) q3p0Var).a, (e090) null, (String) null, (String) null, 59));
        }
        if (q3p0Var instanceof l3p0) {
            return Next.a(Collections.singleton(new x2p0(((l3p0) q3p0Var).a)));
        }
        if (!(q3p0Var instanceof m3p0)) {
            if (q3p0Var instanceof i3p0) {
                return Next.a(Collections.singleton(u2p0.a));
            }
            if (q3p0Var instanceof n3p0) {
                return Next.h(q4p0.b(q4p0Var, false, ((n3p0) q3p0Var).a, false, (e090) null, (String) null, (String) null, 61));
            }
            if (q3p0Var instanceof p3p0) {
                return Next.h(q4p0.b(q4p0Var, false, false, false, (e090) null, ((p3p0) q3p0Var).a, (String) null, 47));
            }
            if (q3p0Var instanceof j3p0) {
                return Next.h(q4p0.b(q4p0Var, false, false, false, (e090) null, (String) null, ((j3p0) q3p0Var).a, 31));
            }
            eg.o();
            return null;
        }
        m3p0 m3p0Var = (m3p0) q3p0Var;
        e090 e090Var = m3p0Var.a;
        boolean zJ = u890.j(e090Var, c090.a);
        Set setSingleton = w7x.a;
        if ((zJ || u890.j(e090Var, d090.a) || u890.j(e090Var, yz80.a)) && (q4p0Var.d instanceof zz80)) {
            setSingleton = Collections.singleton(new w2p0(m3p0Var.b));
        }
        return Next.i(q4p0.b(q4p0Var, false, false, false, m3p0Var.a, (String) null, (String) null, 55), setSingleton);
    }
}
