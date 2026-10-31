package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t491 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t491(int i, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:257:0x0571  */
    /* JADX WARN: Code duplicated, block: B:258:0x057e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0584  */
    /* JADX WARN: Code duplicated, block: B:277:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        lvy lvyVar;
        lvy lvyVar2;
        g791 g791Var;
        nm91 lm91Var;
        g791 g791VarI;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        mq70 mq70Var2;
        up70 up70VarA2;
        String string;
        String string2;
        String string3;
        ksd1 m231Var;
        byte b = this.a;
        g791 g791Var2 = "";
        int i2 = -1;
        int i3 = 2;
        boolean z = false;
        g791 g791Var3 = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                q491 q491Var = (q491) obj;
                o491 o491Var = (o491) obj2;
                PlayerState playerState = o491Var.a;
                boolean zV = s3o1.v((ContextTrack) playerState.track().b(), false);
                boolean zContains = playerState.signals().contains("skip-ad");
                int iC = l1d.C(q491Var.b);
                if (iC != 0) {
                    if (iC != 1) {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i = 2;
                    } else {
                        i = 1;
                    }
                } else if (zV) {
                    i = 2;
                } else {
                    i = 1;
                }
                return new p491(i, o491Var.b.a, zContains, q491Var.c);
            case 1:
                f791 f791Var = (f791) obj;
                d791 d791Var = (d791) obj2;
                fvf1 fvf1Var = d791Var.a;
                if (d791Var.b.disallowSeekingReasons().isEmpty()) {
                    List list = f791Var.a;
                    long j = fvf1Var.a;
                    long j2 = fvf1Var.b;
                    Iterator it = list.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        if (((lvy) it.next()).b.a > j) {
                            i2 = i4;
                            lvyVar = (lvy) o7h.t0(i2, list);
                            if (lvyVar != null) {
                                g791Var3 = new g791(lvyVar.a, i2, (int) lvyVar.b.a);
                            } else if (j2 > 0) {
                                lvyVar2 = (lvy) o7h.C0(list);
                                if (lvyVar2 != null && (g791Var = lvyVar2.a) != null) {
                                    g791Var2 = g791Var;
                                }
                                g791Var3 = new g791(g791Var2, Math.max(p7h.L(list), 0), (int) j2);
                            }
                        } else {
                            i4++;
                        }
                    }
                    lvyVar = (lvy) o7h.t0(i2, list);
                    if (lvyVar != null) {
                        g791Var3 = new g791(lvyVar.a, i2, (int) lvyVar.b.a);
                    } else if (j2 > 0) {
                        lvyVar2 = (lvy) o7h.C0(list);
                        if (lvyVar2 != null) {
                            g791Var2 = g791Var;
                        }
                        g791Var3 = new g791(g791Var2, Math.max(p7h.L(list), 0), (int) j2);
                    }
                }
                return new e791(g791Var3, d791Var.c, f791Var.b, fvf1Var.a);
            case 2:
                ((Number) obj2).intValue();
                fq7.w(et40.a, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                oe91.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                return f6o1.A(new kpg0(new cx0((byte) 29), fe91.d), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 5:
                cm91 cm91Var = (cm91) obj2;
                String str2 = cm91Var.b;
                String str3 = cm91Var.a;
                boolean z2 = cm91Var.d;
                sp91 sp91Var = cm91Var.c;
                rp91 rp91Var = sp91Var.a;
                boolean z3 = sp91Var.j;
                Set set = sp91Var.i;
                int iOrdinal = rp91Var.ordinal();
                rp91 rp91Var2 = rp91.c;
                if (iOrdinal == 0) {
                    if (!set.contains(rp91Var2) && !z3) {
                        z = true;
                    }
                    lm91Var = new lm91(z);
                } else if (iOrdinal == 1) {
                    if (set.contains(rp91Var2) && !z3) {
                        z = true;
                    }
                    lm91Var = new mm91(z);
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    lm91Var = nm91.d;
                }
                return new em91(str2, str3, lm91Var, z2, sp91Var, cm91Var.e);
            case 6:
                f7a1 f7a1Var = ((p8a1) obj2).a;
                if (f7a1Var == null) {
                    return new o8a1();
                }
                ArrayList arrayList = f7a1Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((b7a1) obj3).e) {
                        arrayList2.add(obj3);
                    }
                }
                List listS = sto1.s(arrayList2);
                List<hwm> list2 = listS;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (hwm hwmVar : list2) {
                    arrayList3.add(new n8a1(hwmVar.a, hwmVar.c, hwmVar.b));
                }
                return new o8a1(arrayList3, !listS.isEmpty());
            case 7:
                r9a1 r9a1Var = (r9a1) obj;
                i1r i1rVar = (k1r) obj2;
                boolean z4 = i1rVar instanceof i1r;
                String str4 = r9a1Var.a;
                qtt0 qtt0Var = qtt0.b;
                if (!z4) {
                    return new s9a1(str4, "", z6x.a, null, 3, qtt0Var, r9a1Var.b, null);
                }
                q9a1 q9a1Var = (q9a1) i1rVar.a;
                String str5 = q9a1Var.a;
                ArrayList arrayList4 = q9a1Var.b;
                String str6 = q9a1Var.c;
                int i5 = q9a1Var.d;
                qtt0 qtt0Var2 = q9a1Var.e;
                if (qtt0Var2 != null) {
                    qtt0Var = qtt0Var2;
                }
                return new s9a1(str4, str5, arrayList4, str6, i5, qtt0Var, r9a1Var.b, q9a1Var.f);
            case 8:
                ((Number) obj2).intValue();
                crm0.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                sjo0.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                sjo0.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                acq0.w((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                acq0.x((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                id41 id41Var = (id41) obj;
                bw91 bw91Var = ((bab1) obj2).a;
                ArrayList arrayList5 = new ArrayList(q7h.U(bw91Var, 10));
                ek60 ek60VarListIterator = bw91Var.listIterator();
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (ek60Var.hasNext()) {
                        arrayList5.add(((z9b1) ek60Var.next()).a);
                    } else {
                        df41 df41Var = j2h1.b;
                        ArrayList arrayList6 = new ArrayList(q7h.U(bw91Var, 10));
                        ek60 ek60VarListIterator2 = bw91Var.listIterator();
                        while (true) {
                            ek60 ek60Var2 = ek60VarListIterator2;
                            if (!ek60Var2.hasNext()) {
                                return sqg0.J(new mmr0[]{new mmr0("ids", arrayList5), new mmr0("targets", arrayList6)});
                            }
                            arrayList6.add(df41Var.a.invoke(id41Var, ((z9b1) ek60Var2.next()).b));
                        }
                    }
                }
                break;
            case 14:
                ceb1 ceb1Var = (ceb1) obj2;
                if (((xdb1) obj).b) {
                    g791VarI = new zdb1("");
                } else {
                    cmj1 cmj1Var = ceb1Var.d;
                    xkk1 xkk1Var = ceb1Var.a;
                    cmj1 cmj1Var2 = cmj1.c;
                    vp70 vp70Var = vp70.c;
                    if (cmj1Var == cmj1Var2) {
                        g791VarI = fob.h(ceb1Var);
                        if (g791VarI == null) {
                            if (xkk1Var != null && (mq70Var2 = xkk1Var.a) != null && (up70VarA2 = mq70Var2.a(vp70Var)) != null) {
                                g791Var3 = up70VarA2.a.a;
                            }
                            g791VarI = new ydb1(g791Var3 != null ? g791Var3 : "");
                        }
                    } else if (cmj1Var == cmj1.b) {
                        g791VarI = fob.h(ceb1Var);
                        if (g791VarI == null) {
                            hll hllVar = ceb1Var.c;
                            if (hllVar != null && hllVar.d.contains(fll.c) && xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70Var)) != null && (str = up70VarA.a.a) != null) {
                                g791Var3 = new ydb1(str);
                            }
                            g791VarI = g791Var3 != null ? g791Var3 : fob.i(ceb1Var);
                        }
                    } else if (!ceb1Var.e || (g791VarI = fob.h(ceb1Var)) == null) {
                        g791VarI = fob.i(ceb1Var);
                    }
                }
                qfd qfdVar = ceb1Var.b;
                if (qfdVar != null && !qfdVar.b && qfdVar.c == 3) {
                    z = true;
                }
                return new beb1(g791VarI, z);
            case 15:
                yeb1 yeb1Var = (yeb1) obj2;
                return new xeb1(((web1) obj).a, yeb1Var.a, yeb1Var.b);
            case 16:
                yeb1 yeb1Var2 = (yeb1) obj2;
                return new xeb1(((web1) obj).a, yeb1Var2.a, yeb1Var2.b);
            case 17:
                cob1 cob1Var = (cob1) obj2;
                String str7 = ((jo70) obj).a;
                int i6 = cob1Var == null ? -1 : mfb1.a[cob1Var.ordinal()];
                if (i6 == -1 || i6 == 1) {
                    i3 = 1;
                } else if (i6 != 2) {
                    if (i6 != 3) {
                        eg.o();
                        return null;
                    }
                    i3 = 3;
                }
                return new lfb1(str7, i3);
            case 18:
                ksb1 ksb1Var = (ksb1) obj;
                jsb1 jsb1Var = (jsb1) obj2;
                boolean z5 = jsb1Var.a;
                ksb1 ksb1VarF = qsb1.f(ksb1Var, z5);
                if (z5 && ksb1Var.g && ksb1Var.b == xsb1.i) {
                    int i7 = jsb1Var.b;
                    g791 g791VarValueOf = Integer.valueOf(i7);
                    if (i7 > 0) {
                        g791Var3 = g791VarValueOf;
                    }
                }
                return new lsb1(ksb1VarF, g791Var3);
            case 19:
                return new n0c1((uqo) obj2, (o0c1) ((Parcelable) jhc1.t((Bundle) obj, "externalState", o0c1.class)));
            case 20:
                Object objT = jhc1.t((Bundle) obj, "externalState", i1c1.class);
                objT.getClass();
                i1c1 i1c1Var = (Parcelable) objT;
                return new j1c1((uqo) obj2, i1c1Var.a, i1c1Var.b, i1c1Var.c, i1c1Var.d);
            case 21:
                return j2h1.b.a.invoke((id41) obj, ((n8d1) obj2).b.getValue());
            case 22:
                o5e0 o5e0Var = (o5e0) obj2;
                int i8 = ((fgd1) obj).a;
                boolean z6 = o5e0Var instanceof c5e0;
                igd1 igd1Var = hgd1.c;
                if (!z6) {
                    if (o5e0Var instanceof f5e0) {
                        igd1Var = igd1.c;
                    } else {
                        boolean zEquals = o5e0Var.equals(h5e0.a);
                        igd1 igd1Var2 = jgd1.c;
                        if (zEquals) {
                            igd1Var = igd1Var2;
                        } else if (!(o5e0Var instanceof i5e0) && !(o5e0Var instanceof l5e0) && !o5e0Var.equals(j5e0.a)) {
                            if (o5e0Var.equals(k5e0.a)) {
                                igd1Var = igd1Var2;
                            } else if (!(o5e0Var instanceof m5e0)) {
                                eg.o();
                                return null;
                            }
                        }
                    }
                }
                return new ggd1(i8, igd1Var);
            case 23:
                id41 id41Var2 = (id41) obj;
                uhd1 uhd1Var = (uhd1) obj2;
                df41 df41Var2 = j2h1.b;
                c380 c380Var = uhd1Var.a;
                ArrayList arrayList7 = new ArrayList(q7h.U(c380Var, 10));
                Iterator it2 = c380Var.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(df41Var2.a.invoke(id41Var2, it2.next()));
                }
                return sqg0.J(new mmr0[]{new mmr0("currentTabIndex", uhd1Var.d.getValue()), new mmr0("tabs", arrayList7)});
            case 24:
                ((Number) obj2).intValue();
                g0p1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                g0p1.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                j0p1.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                Bundle bundle = (Bundle) obj;
                psd1 psd1Var = (psd1) obj2;
                o3r o3rVar = ysd1.Z;
                if (bundle.containsKey("saved_state_type") && bundle.containsKey("is_sent_by_current_user") && bundle.containsKey("percentage")) {
                    int i9 = bundle.getInt("percentage");
                    boolean z7 = bundle.getBoolean("is_sent_by_current_user");
                    String string4 = bundle.getString("saved_state_type");
                    if (string4 != null) {
                        int iHashCode = string4.hashCode();
                        if (iHashCode != -669878735) {
                            if (iHashCode == -265013972 && string4.equals("revealed") && (string = bundle.getString("entity_uri")) != null && (string2 = bundle.getString("entity_name")) != null && (string3 = bundle.getString("entity_type")) != null) {
                                try {
                                    m231Var = ksd1.valueOf(string3);
                                } catch (Throwable th) {
                                    m231Var = new m231(th);
                                }
                                if (m231Var instanceof m231) {
                                    m231Var = null;
                                }
                                ksd1 ksd1Var = m231Var;
                                if (ksd1Var != null) {
                                    g791Var3 = new ssd1(z7, i9, string, string2, ksd1Var, bundle.getString("creator_name"), bundle.getString("cover_art_url"), null);
                                }
                            }
                        } else if (string4.equals("percentage_only")) {
                            g791Var3 = new rsd1(i9, z7);
                        }
                    }
                    break;
                }
                return g791Var3 == null ? ysd1.g(psd1Var) : g791Var3;
            case 28:
                ((Number) obj2).intValue();
                h1p1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                cvd1.l((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t491(byte b, int i, boolean z) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t491(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
