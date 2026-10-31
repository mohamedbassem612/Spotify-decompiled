package p;

import android.os.Parcelable;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.extras.patterns.InnerUpdate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ko31 extends k01 implements vu30 {
    public static final ko31 h = new ko31(2, jo31.class, "rootPageUpdate", "rootPageUpdate(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllModel;Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;Lcom/spotify/mobius/Update;Lcom/spotify/mobius/Update;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        oo3 no3Var;
        qxd0 on3Var;
        sn3 on3Var2;
        sn3 on3Var3;
        tr3 tr3Var = (tr3) obj;
        mp3 mp3Var = (hr3) obj2;
        gp71 gp71Var = gp71.d;
        InnerUpdate innerUpdateB = lwc0.b();
        sxc0 sxc0Var = tr3Var.b;
        w7c0 w7c0Var = tr3Var.c;
        if (mp3Var instanceof eq3) {
            eq3 eq3Var = (eq3) mp3Var;
            htc0 htc0Var = eq3Var.a;
            Next nextA = innerUpdateB.a(tr3Var, eq3Var);
            if (!nextA.d()) {
                if (nextA.d() || !nextA.c() || !(htc0Var instanceof atc0) || sxc0Var.a.d.isEmpty()) {
                    return nextA;
                }
                atc0 atc0Var = (atc0) htc0Var;
                on90 on90Var = new on90(atc0Var.a, atc0Var.b);
                bqq0 bqq0Var = sxc0Var.a;
                return Next.a(Collections.singleton(new mn3(new not(on90Var, bqq0Var.e, bqq0Var.d))));
            }
            tr3 tr3Var2 = (tr3) nextA.g();
            sxc0 sxc0Var2 = tr3Var2.b;
            xj61 xj61Var = new xj61();
            jo31.r(xj61Var, tr3Var2);
            jo31.q(xj61Var, tr3Var2);
            boolean z = htc0Var instanceof atc0;
            if (z) {
                xj61Var.add(new vn3(z6x.a));
            } else if ((htc0Var instanceof btc0) || (htc0Var instanceof ctc0)) {
                Parcelable parcelable = sxc0Var2.c;
                b8e0 b8e0Var = parcelable instanceof b8e0 ? (b8e0) parcelable : null;
                if (b8e0Var != null) {
                    xj61Var.add(new vn3(o7h.l1(jo31.f(b8e0Var))));
                }
            }
            if (nextA.c()) {
                xj61Var.addAll(nextA.b());
            }
            bqq0 bqq0Var2 = sxc0Var2.a;
            mml mmlVar = bqq0Var2.e;
            if ((mmlVar instanceof lml) && z) {
                lml lmlVar = (lml) mmlVar;
                xj61Var.add(new mn3(new qot(sxc0Var2.c, new vod1(0, lmlVar.a, lmlVar.b), lmlVar, bqq0Var2.d)));
            }
            return Next.i(tr3Var2, cwl1.j(xj61Var));
        }
        if (mp3Var instanceof xo3) {
            uy3 uy3Var = new uy3(((xo3) mp3Var).a);
            xy3 xy3Var = xy3.a;
            return u890.j(w7c0Var.a(xy3Var), uy3Var) ? Next.j() : Next.h(tr3.b(tr3Var, null, null, new w7c0(sqg0.O(w7c0Var.a, Collections.singletonMap(xy3Var, uy3Var))), false, 11));
        }
        if (mp3Var instanceof wo3) {
            oqz0 oqz0Var = sxc0Var.b;
            bqq0 bqq0Var3 = sxc0Var.a;
            boolean zC = oqz0Var.a.c(0);
            if (!zC || (bqq0Var3.d.isEmpty() && bqq0Var3.b() == null)) {
                return (zC && sxc0Var.b()) ? Next.a(Collections.singleton(new on3(m8k1.c))) : Next.a(Collections.singleton(new on3(new e9k1(false))));
            }
            return Next.a(f46.S0(new qxd0[]{new on3(new e9k1(false)), new mn3(new not(sxc0Var.c, bqq0Var3.e, bqq0Var3.d))}));
        }
        if (mp3Var instanceof yo3) {
            yo3 yo3Var = (yo3) mp3Var;
            return Next.a(Effects.a(new on3[]{new on3(new z8k1(yo3Var.b, yo3Var.a))}));
        }
        if (mp3Var instanceof ep3) {
            return Next.a(Effects.a(new un3[]{new un3(((ep3) mp3Var).a)}));
        }
        boolean z2 = mp3Var instanceof fp3;
        jo3 jo3Var = jo3.a;
        qf90 qf90Var = qf90.a;
        if (z2) {
            fp3 fp3Var = (fp3) mp3Var;
            return (u890.j(w7c0Var.a(qf90Var), Boolean.TRUE) && fp3Var.d == aey.d) ? Next.a(Effects.a(new go3[]{new go3(jo3Var)})) : Next.a(Effects.a(new on3[]{w3p1.t(tr3Var, fp3Var)}));
        }
        if (mp3Var instanceof gp3) {
            return Next.a(Effects.a(new on3[]{new on3(new s8k1(((gp3) mp3Var).a))}));
        }
        if (mp3Var instanceof hp3) {
            return Next.i(b6p1.o(tr3Var, false), Collections.singleton(zn3.d));
        }
        if (mp3Var instanceof ip3) {
            xgo xgoVar = new xgo(((ip3) mp3Var).a);
            aho ahoVar = aho.a;
            return u890.j(w7c0Var.a(ahoVar), xgoVar) ? Next.j() : Next.h(tr3.b(tr3Var, null, null, new w7c0(sqg0.O(w7c0Var.a, Collections.singletonMap(ahoVar, xgoVar))), false, 11));
        }
        if (mp3Var instanceof jp3) {
            return Next.a(Collections.singleton(new on3(i9k1.c)));
        }
        if (mp3Var instanceof mp3) {
            d6c0 d6c0Var = mp3Var.a;
            if (d6c0Var instanceof d6c0) {
                return gp71Var.a(tr3Var, new yp3(d6c0Var));
            }
            if (d6c0Var instanceof vod1) {
                bqq0 bqq0Var4 = sxc0Var.a;
                return Next.a(Effects.a(new mn3[]{new mn3(new rot(sxc0Var.c, (vod1) d6c0Var, bqq0Var4.e, bqq0Var4.d))}));
            }
            eg.o();
            return null;
        }
        if (mp3Var instanceof vp3) {
            return Next.a(Effects.a(new do3[]{new do3(((vp3) mp3Var).a)}));
        }
        boolean z3 = mp3Var instanceof sp3;
        d7p1 t8k1Var = q8k1.c;
        p8k1 p8k1Var = p8k1.c;
        if (z3) {
            sp3 sp3Var = (sp3) mp3Var;
            String str = sp3Var.a;
            tv80 tv80Var = sp3Var.c;
            HashSet hashSetA = Effects.a(new nn3[]{new nn3(str, cfu.a)});
            String str2 = sp3Var.b;
            if (str2.length() > 0) {
                if (str2.equals(nik1.C1.a)) {
                    t8k1Var = new s8k1(tv80Var);
                } else if (str2.equals(nik1.L0.a)) {
                    t8k1Var = p8k1Var;
                } else if (!str2.equals(nik1.M0.a)) {
                    t8k1Var = new t8k1(str2, null, tv80Var, h4p1.o(tr3Var, (aey) null));
                }
                hashSetA.add(new on3(t8k1Var));
            }
            return Next.a(hashSetA);
        }
        if (mp3Var instanceof tp3) {
            return Next.a(Effects.a(new nn3[]{new nn3(((tp3) mp3Var).a, efu.a)}));
        }
        if (mp3Var instanceof up3) {
            List list = ((up3) mp3Var).a;
            return u890.j(w7c0Var.a(vg60.a), list) ? Next.j() : Next.h(iqo1.s(tr3Var, list));
        }
        if (mp3Var instanceof zp3) {
            zp3 zp3Var = (zp3) mp3Var;
            String str3 = zp3Var.a;
            return Next.i(jo31.v(tr3Var, str3), Effects.a(new nn3[]{new nn3(str3, new gfu(zp3Var.b))}));
        }
        if (mp3Var instanceof aq3) {
            aq3 aq3Var = (aq3) mp3Var;
            String str4 = aq3Var.a;
            String str5 = aq3Var.b;
            tv80 tv80Var2 = aq3Var.d;
            n6c0 n6c0Var = aq3Var.c;
            HashSet hashSetA2 = Effects.a(new nn3[]{new nn3(str4, new gfu(n6c0Var))});
            if (n6c0Var.a == e8a.c) {
                hashSetA2.add(new yn3(tv80Var2));
            } else if (str5.length() > 0) {
                hashSetA2.add(new on3(new c9k1(str5, tv80Var2)));
            }
            return Next.i(jo31.v(tr3Var, str4), hashSetA2);
        }
        if (mp3Var instanceof bq3) {
            bq3 bq3Var = (bq3) mp3Var;
            String str6 = bq3Var.a;
            return Next.i(jo31.v(tr3Var, str6), Effects.a(new nn3[]{new nn3(str6, new gfu(bq3Var.b))}));
        }
        if (mp3Var instanceof dq3) {
            dq3 dq3Var = (dq3) mp3Var;
            w7c0 w7c0Var2 = dq3Var.a;
            Map map = w7c0Var2.a;
            if (u890.j(w7c0Var, w7c0Var2)) {
                return Next.j();
            }
            p811 p811Var = new p811();
            p811Var.a = tr3.b(tr3Var, null, null, new w7c0(sqg0.O(w7c0Var.a, map)), false, 11);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            vvu0 vvu0Var = new vvu0(linkedHashSet, p811Var, tr3Var, dq3Var, (byte) 24);
            for (Map.Entry entry : map.entrySet()) {
                if (!u890.j(entry.getValue(), w7c0Var.a((v7c0) entry.getKey()))) {
                    vvu0Var.invoke(entry.getKey());
                }
            }
            if (linkedHashSet.isEmpty() && !u890.j(p811Var.a, tr3Var)) {
                return Next.h(p811Var.a);
            }
            if (linkedHashSet.isEmpty() || u890.j(p811Var.a, tr3Var)) {
                return !linkedHashSet.isEmpty() ? Next.a(linkedHashSet) : Next.j();
            }
            return Next.i(p811Var.a, linkedHashSet);
        }
        boolean z4 = mp3Var instanceof fq3;
        qzi0 qzi0Var = qzi0.a;
        if (z4) {
            fq3 fq3Var = (fq3) mp3Var;
            Object rzi0Var = (tzi0) w7c0Var.a(qzi0Var);
            if (rzi0Var instanceof rzi0) {
                List list2 = ((rzi0) rzi0Var).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!u890.j(((fhy) obj3).b, fq3Var.a)) {
                        arrayList.add(obj3);
                    }
                }
                rzi0Var = new rzi0(arrayList);
            } else if (!(rzi0Var instanceof szi0)) {
                eg.o();
                return null;
            }
            return Next.h(tr3.b(tr3Var, null, null, new w7c0(sqg0.O(w7c0Var.a, Collections.singletonMap(qzi0Var, rzi0Var))), false, 11));
        }
        if (mp3Var instanceof gq3) {
            List list3 = ((gq3) mp3Var).a;
            return u890.j(w7c0Var.a(qzi0Var), list3) ? Next.j() : Next.h(tr3.b(tr3Var, null, null, new w7c0(sqg0.O(w7c0Var.a, Collections.singletonMap(qzi0Var, new rzi0(list3)))), false, 11));
        }
        if (mp3Var instanceof lq3) {
            lq3 lq3Var = (lq3) mp3Var;
            boolean zJ = u890.j(w7c0Var.a(qf90Var), Boolean.TRUE);
            int i = lq3Var.a;
            if (zJ) {
                int iC = l1d.C(i);
                if (iC == 0) {
                    on3Var2 = new go3(ho3.a);
                } else if (iC == 1) {
                    on3Var2 = new go3(io3.a);
                } else if (iC == 2) {
                    on3Var2 = new go3(jo3Var);
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    on3Var2 = new go3(lo3.a);
                }
            } else {
                tv80 tv80Var3 = lq3Var.b;
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    on3Var2 = new on3(p8k1Var);
                } else if (iC2 != 1) {
                    if (iC2 == 2) {
                        on3Var3 = new on3(new u8k1(tv80Var3));
                    } else {
                        if (iC2 != 3) {
                            eg.o();
                            return null;
                        }
                        on3Var3 = new sn3(tv80Var3);
                    }
                    on3Var2 = on3Var3;
                } else {
                    on3Var2 = new on3(t8k1Var);
                }
            }
            return Next.a(Collections.singleton(on3Var2));
        }
        if (mp3Var instanceof hq3) {
            hq3 hq3Var = (hq3) mp3Var;
            eab0 eab0Var = new eab0(hq3Var.a, hq3Var.b);
            if (u890.j(sxc0Var.a.a.f, eab0Var)) {
                return Next.j();
            }
            fab0 fab0Var = sxc0Var.a.a;
            return Next.a(Collections.singleton(new tn3(new yoc0(new fqq0((as3) null, (dia1) null, (jf20) null, (mml) null, (Boolean) null, new fab0(fab0Var.a, fab0Var.b, fab0Var.c, fab0Var.d, fab0Var.e, eab0Var), (a3t0) null, (Boolean) null, (Boolean) null, 479)))));
        }
        if (mp3Var instanceof cq3) {
            as3 as3Var = sxc0Var.a.b;
            as3 as3Var2 = ((cq3) mp3Var).a;
            return as3Var == as3Var2 ? Next.j() : Next.a(Effects.a(new tn3[]{new tn3(new yoc0(new fqq0(as3Var2, (dia1) null, (jf20) null, (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 510)))}));
        }
        if (mp3Var instanceof oq3) {
            oq3 oq3Var = (oq3) mp3Var;
            bqq0 bqq0Var5 = sxc0Var.a;
            a3t0 a3t0Var = bqq0Var5.g;
            a3t0 a3t0Var2 = oq3Var.a;
            boolean z5 = oq3Var.b;
            if (a3t0Var == a3t0Var2 && bqq0Var5.h == z5) {
                return Next.j();
            }
            tn3 tn3Var = new tn3(new yoc0(new fqq0((as3) null, (dia1) null, (jf20) null, (mml) null, (Boolean) null, (fab0) null, a3t0Var2, Boolean.valueOf(z5), (Boolean) null, 319)));
            return (!z5 || sxc0Var.a.h) ? Next.a(Effects.a(new tn3[]{tn3Var})) : Next.a(Effects.a(new qxd0[]{tn3Var, new on3(f9k1.c)}));
        }
        if (mp3Var instanceof pq3) {
            return Next.a(Effects.a(new on3[]{new on3(new x8k1(((pq3) mp3Var).a))}));
        }
        if (mp3Var instanceof sq3) {
            return Next.a(Effects.a(new on3[]{new on3(new y8k1(((sq3) mp3Var).a))}));
        }
        if (mp3Var instanceof lp3) {
            return Next.a(Effects.a(new pn3[]{pn3.d}));
        }
        if (mp3Var instanceof wq3) {
            return Next.a(Effects.a(new to3[]{new to3(((wq3) mp3Var).a)}));
        }
        if (mp3Var instanceof vq3) {
            return Next.a(Effects.a(new qn3[]{qn3.d}));
        }
        if (mp3Var instanceof xq3) {
            boolean z6 = tr3Var.d;
            boolean z7 = ((xq3) mp3Var).a;
            if (z6 == z7) {
                return Next.j();
            }
            return z7 ? Next.i(tr3.b(tr3Var, null, null, null, true, 7), Effects.a(new on3[]{new on3(new e9k1(false))})) : Next.h(tr3.b(tr3Var, null, null, null, false, 7));
        }
        if (mp3Var instanceof tq3) {
            tq3 tq3Var = (tq3) mp3Var;
            Map map2 = tq3Var.b;
            int iOrdinal = tq3Var.a.ordinal();
            if (iOrdinal == 0) {
                on3Var = new on3(new w8k1(o7h.l1(map2.keySet())));
            } else if (iOrdinal == 1) {
                on3Var = new vo3(o7h.l1(map2.keySet()));
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                on3Var = new jn3(map2);
            }
            return Next.a(Effects.a(new qxd0[]{on3Var}));
        }
        if (mp3Var instanceof yq3) {
            return Next.a(Effects.a(new ln3[]{new ln3(((yq3) mp3Var).a)}));
        }
        if (mp3Var instanceof uq3) {
            uq3 uq3Var = (uq3) mp3Var;
            Set set = uq3Var.b;
            Set set2 = uq3Var.c;
            Set set3 = set2;
            ln3 ln3Var = new ln3(dm61.v0(set, set3));
            int size = dm61.v0(dm61.v0(set, set3), uq3Var.d).size();
            if (!set2.isEmpty()) {
                no3Var = mo3.a;
            } else {
                if (size <= 0) {
                    return Next.a(Effects.a(new ln3[]{ln3Var}));
                }
                no3Var = new no3(uq3Var.a, size);
            }
            return Next.a(Effects.a(new qxd0[]{ln3Var, new go3(no3Var)}));
        }
        if (mp3Var instanceof qq3) {
            qq3 qq3Var = (qq3) mp3Var;
            return Next.a(Effects.a(new wn3[]{new wn3(qq3Var.a, qq3Var.b)}));
        }
        if (mp3Var instanceof kp3) {
            return Next.a(Effects.a(new on3[]{new on3(new z8k1("spotify:internal:download-center", ((kp3) mp3Var).a))}));
        }
        if (mp3Var instanceof zq3) {
            return Next.a(Collections.singleton(new on3(new k9k1(((zq3) mp3Var).a))));
        }
        if (mp3Var instanceof ar3) {
            bqq0 bqq0Var6 = sxc0Var.a;
            dia1 dia1Var = bqq0Var6.c;
            dia1 dia1Var2 = ((ar3) mp3Var).a;
            return dia1Var == dia1Var2 ? Next.j() : Next.a(f46.S0(new qxd0[]{new tn3(new yoc0(new fqq0((as3) null, dia1Var2, (jf20) null, (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 509))), new bo3(dia1Var2, new uia1(bqq0Var6.e, bqq0Var6.d))}));
        }
        if (mp3Var instanceof er3) {
            un90 un90Var = sxc0Var.c;
            vod1 vod1Var = ((er3) mp3Var).a;
            bqq0 bqq0Var7 = sxc0Var.a;
            return Next.a(Effects.a(new mn3[]{new mn3(new qot(un90Var, vod1Var, bqq0Var7.e, bqq0Var7.d))}));
        }
        if (mp3Var instanceof fr3) {
            un90 un90Var2 = sxc0Var.c;
            vod1 vod1Var2 = ((fr3) mp3Var).a;
            bqq0 bqq0Var8 = sxc0Var.a;
            return Next.a(Effects.a(new mn3[]{new mn3(new rot(un90Var2, vod1Var2, bqq0Var8.e, bqq0Var8.d))}));
        }
        if (!(mp3Var instanceof gr3)) {
            return gp71Var.a(tr3Var, mp3Var);
        }
        Set set4 = ((gr3) mp3Var).a;
        h0v0 h0v0Var = h0v0.a;
        return u890.j(w7c0Var.a(h0v0Var), set4) ? Next.j() : Next.h(tr3.b(tr3Var, null, null, new w7c0(sqg0.O(w7c0Var.a, Collections.singletonMap(h0v0Var, set4))), false, 11));
    }
}
