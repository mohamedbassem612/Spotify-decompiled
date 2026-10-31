package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.format.DateUtils;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class s110 {
    public static final String[] a = {"playlist-read-collaborative", "playlist-read-private", "streaming", "user-follow-read", "user-follow-modify", "user-library-read", "user-library-modify", "user-read-private", "radio-read", "radio-modify", "user-personalized", "user-top-read"};
    public static b180 b;
    public static b180 c;

    public static final void a(Uri uri, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var;
        pxa i9hVar;
        as80 as80Var = mif1.V0;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-752837631);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(uri) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            boolean zG = x340Var2.g(context);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                Drawable drawable = context.getDrawable(2131233988);
                if (drawable != null) {
                    i9hVar = new pxa(new yk4(mno1.z(drawable, 0, 0, 7)));
                } else {
                    n57.s("Failed to get placeholder painter");
                    i9hVar = new i9h(u7h.j);
                }
                objT = i9hVar;
                x340Var2.s0(objT);
            }
            jmr0 jmr0Var = (jmr0) objT;
            isl islVar = isl.a;
            if (uri != null) {
                x340Var2.i0(533509903);
                eso1.e(uri, islVar, d7e.r(1.0f, qim0Var, false), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new pux(jmr0Var, jmr0Var), false, false, x340Var2, (i2 & 14) | 1073741872, 0, 3512);
                x340Var = x340Var2;
                x340Var.r(false);
                qim0Var2 = qim0Var;
            } else {
                x340Var = x340Var2;
                x340Var.i0(533795351);
                qim0Var2 = qim0Var;
                eso1.h(jmr0Var, islVar, d7e.r(1.0f, qim0Var2, false), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, x340Var, 56, 440);
                x340Var.r(false);
            }
        } else {
            qim0Var2 = qim0Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(uri, qim0Var2, i, (byte) 9);
        }
    }

    public static final void b(ld5 ld5Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-814775209);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ld5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        byte b2 = 0;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            nyx.a(2, (wux) null, apo.r(638299754, new mbf0(ld5Var), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(ld5Var, qim0Var, i, b2);
        }
    }

    public static final void c(otn0 otn0Var, Float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1117263483);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(otn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = otn0Var.g;
            int i3 = z ? 2131954677 : 2131954678;
            gbx gbxVar = otn0Var.h;
            String strO0 = cwl1.o0(x340Var, i3);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            } else {
                mp10.b(new otn0(otn0Var.a, otn0Var.b, otn0Var.c, otn0Var.d, otn0Var.e, otn0Var.f, false, new gbx(new y50(strO0), gbxVar.b)), qim0Var2, apo.r(-1884156082, new fvb(f, z), x340Var), x340Var, ((i2 >> 3) & 112) | 384, 0);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(otn0Var, f, qim0Var, i, (byte) 3);
        }
    }

    public static final void d(yxa0 yxa0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1027531324);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(yxa0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof uxa0)) {
            x340Var.i0(-953603937);
            gfx.h(13, apo.r(918972073, new ak10(j2iVar, (byte) 3), x340Var), x340Var, 54);
            x340Var.r(false);
        } else {
            if (!(yxa0Var instanceof xxa0)) {
                throw p3d1.k(x340Var, 384878741, false);
            }
            x340Var.i0(384885650);
            gfx.b(4, apo.r(-1355478374, new ak10(j2iVar, b2), x340Var), x340Var, 54);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(yxa0Var, j2iVar, i, (byte) 19);
        }
    }

    public static final void e(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1584065470);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            ldx ldxVar = ldx.c;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str), function0), ldxVar, qim0VarF, null, null, null, null, null, null, null, apo.r(-1957070271, new dz40(str, (byte) 20), x340Var), x340Var, 0, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 11);
        }
    }

    public static final void f(String str, f490 f490Var, f490 f490Var2, p350 p350Var, b0k b0kVar, int i) {
        p350 p350Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(479762364);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(f490Var) ? 32 : 16) | (x340Var.i(f490Var2) ? 256 : 128) | (x340Var.i(p350Var) ? 2048 : 1024);
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mqo1.e(p350Var, null, null, mti.a, apo.r(-1473129475, new dz40(str, (byte) 21), x340Var), apo.r(-1463358914, new mb90(f490Var, f490Var2, p350Var, b2), x340Var), null, x340Var, ((i2 >> 9) & 14) | 224256, 70);
            p350Var2 = p350Var;
        } else {
            p350Var2 = p350Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i490(str, f490Var, f490Var2, p350Var2, i);
        }
    }

    public static final void g(atb1 atb1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1357816245);
        int i2 = (b0kVar3.g(atb1Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = String.format("stats_tile_tag_%s", Arrays.copyOf(new Object[]{atb1Var.a}, 1));
            String strO0 = cwl1.o0(b0kVar3, 2131962928);
            boolean z = (i2 & 112) == 32;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new l5a1(iu30Var, atb1Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = hqn1.s(str, strO0, (Function0) objT, qim0Var3);
            boolean z3 = i3 == 4;
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new dr91(atb1Var, (byte) 8);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarY = u291.y(s161.a(qim0VarS, (iu30) objT2), een.Z, true);
            mgx mgxVar = mgx.e;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarY, (tl3) null, cr31VarB, mgxVar, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1475255490, new k681(atb1Var, (byte) 18), b0kVar3), b0kVar2, 0, 48, 2018);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(atb1Var, iu30Var, qim0Var2, i);
        }
    }

    public static final rjm0 h(o8n o8nVar) {
        rjm0 rjm0VarA = o8nVar.A(bj20.P0);
        if (rjm0VarA != null) {
            return rjm0VarA;
        }
        eg.m("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final boolean i(gcu gcuVar) {
        return gcuVar.d && gcuVar.c && gcuVar.a && gcuVar.b;
    }

    public static final Object j(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    public static final w7h1 k(obw0 obw0Var, hob1 hob1Var, c700 c700Var, String str, boolean z) {
        String str2 = hob1Var.b;
        if (c700Var instanceof kwz) {
            return obw0Var.a(str);
        }
        boolean z2 = c700Var instanceof gzz;
        b7x b7xVar = b7x.a;
        if (z2) {
            if (!rwq.j(hob1Var)) {
                return obw0Var.a(str);
            }
            rsk0 rsk0Var = ((dsj1) obw0Var).a;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str2 == null) {
                str2 = "";
            }
            return new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), rsk0Var.c, rsk0Var.b, System.currentTimeMillis());
        }
        if ((c700Var instanceof nwz) || c700Var.equals(hzz.a)) {
            return obw0Var.g();
        }
        if (c700Var instanceof mxz) {
            return obw0Var.f().a(str2);
        }
        if (!(c700Var instanceof w500)) {
            if (c700Var instanceof zvz) {
                return obw0Var.c().a(hob1Var.O ? hob1Var.e : hob1Var.d);
            }
            return null;
        }
        if (hob1Var.J && z) {
            return obw0Var.a(str);
        }
        rsk0 rsk0Var2 = ((dsj1) obw0Var).a;
        x6h1 x6h1VarC = rsk0Var2.c.c();
        x6h1VarC.i.add(new a7h1("video_frame", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
        if (str2 == null) {
            str2 = "";
        }
        return new w7h1("", "", z7h1Var2, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), y6h1VarA, rsk0Var2.b, System.currentTimeMillis());
    }

    public static boolean l(bgl1 bgl1Var) {
        int iOrdinal = bgl1Var.ordinal();
        return iOrdinal == 6 || iOrdinal == 7;
    }

    public static int m(long j) {
        ytw0 ytw0Var = jfv.b;
        long jK0 = fdg1.k0(1, ngv.g);
        ngv ngvVar = ngv.e;
        return (int) Math.floor((jfv.u(fdg1.k0(29, ngv.f), ngvVar) + j) / jfv.u(jK0, ngvVar));
    }

    public static final void n(AtomicReference atomicReference, Object obj) {
        atomicReference.set(obj);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:109:0x01df  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:85:0x018a  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad  */
    public static final qdf1 o(pdf1 pdf1Var, List list, yqg yqgVar) {
        rdf1 rdf1Var;
        u7h u7hVar;
        mq70 mq70Var;
        pp70 pp70Var;
        u7h u7hVar2;
        List list2;
        String strI;
        boolean zY;
        String str;
        String strConcat;
        mq70 mq70Var2;
        String str2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        Long lValueOf;
        List list3;
        up70 up70Var;
        io70 io70Var;
        pp70 pp70Var2;
        mq70 mq70Var3;
        List list4;
        up70 up70Var2;
        long j = 0;
        long j2 = 1000;
        if (list.isEmpty()) {
            ArrayList<sdf1> arrayList = pdf1Var.b;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (sdf1 sdf1Var : arrayList) {
                long j3 = sdf1Var.e;
                arrayList2.add(new rdf1(sdf1Var.a, sdf1Var.b, sdf1Var.d, j3 > 0 ? DateUtils.getRelativeTimeSpanString(j3 * 1000, yqgVar.b(), 60000L).toString() : null));
            }
            return new qdf1(arrayList2);
        }
        List<mmr0> list5 = list;
        ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
        for (mmr0 mmr0Var : list5) {
            sdf1 sdf1Var2 = (sdf1) mmr0Var.a;
            i1r i1rVar = (k1r) mmr0Var.b;
            long j4 = sdf1Var2.e;
            String str3 = sdf1Var2.d;
            String str4 = sdf1Var2.b;
            String str5 = sdf1Var2.a;
            String str6 = sdf1Var2.c;
            String string = j4 > j ? DateUtils.getRelativeTimeSpanString(j4 * j2, yqgVar.b(), 60000L).toString() : null;
            i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
            ydf1 ydf1Var = i1rVar2 != null ? (ydf1) i1rVar2.a : null;
            if (str6 == null || ydf1Var == null) {
                j2 = j2;
                rdf1Var = new rdf1(str5, str4, str3, string);
            } else {
                zoy0 zoy0Var = ydf1Var.c;
                jo70 jo70Var = ydf1Var.a;
                xkk1 xkk1Var = ydf1Var.b;
                String str7 = (xkk1Var == null || (mq70Var3 = xkk1Var.a) == null || (list4 = mq70Var3.a) == null || (up70Var2 = (up70) o7h.s0(list4)) == null) ? null : up70Var2.a.a;
                if (xkk1Var == null || (pp70Var2 = xkk1Var.d) == null) {
                    if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) {
                        u7hVar = null;
                    } else {
                        u7hVar2 = new u7h(pp70Var.c.a.c);
                    }
                    if (jo70Var != null) {
                        list2 = jo70Var.d;
                        if (str7 != null) {
                            strI = jo70Var.b;
                            if (!list2.isEmpty()) {
                                strI = xcg1.i(strI, " • ", ((ho70) list2.get(0)).a);
                            }
                            String str8 = strI;
                            zY = nhc1.Y(str6, "spotify:podcast-chapter", false);
                            boolean zR = l4o1.R(zoy0Var);
                            if (zY || (io70Var = jo70Var.e) == null) {
                                str = str6;
                            } else {
                                str = io70Var.b;
                            }
                            if (nhc1.Y(str, "spotify:artist:", false)) {
                                strConcat = "spotify:list:popular-release-segments-main-roles:artist_".concat(ihc1.X0(str, ":artist:"));
                            } else {
                                strConcat = str;
                            }
                            mq70Var2 = xkk1Var.b;
                            if (mq70Var2 != null || (list3 = mq70Var2.a) == null || (up70Var = (up70) o7h.s0(list3)) == null) {
                                str2 = null;
                            } else {
                                str2 = up70Var.a.a;
                            }
                            if (!zY || nhc1.Y(str6, "spotify:episode:", false) || nhc1.Y(str6, "spotify:track:", false)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!nhc1.Y(str, "spotify:artist:", false) || nhc1.Y(str, "spotify:author:", false)) {
                                i = 2;
                            } else {
                                if (!z || str2 == null) {
                                    i2 = 1;
                                } else {
                                    i = 3;
                                }
                                if (nhc1.Y(str, "spotify:author:", false) && !nhc1.Y(str, "spotify:concert:", false)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                String str9 = jo70Var.a;
                                if (zoy0Var != null) {
                                    lValueOf = Long.valueOf(zoy0Var.c * j2);
                                } else {
                                    lValueOf = null;
                                }
                                rdf1Var = new rdf1(str5, str4, new cvt0(str9, str8, str7, str, strConcat, false, i2, z2, str2, zR, lValueOf), str3, u7hVar, string);
                            }
                            i2 = i;
                            if (nhc1.Y(str, "spotify:author:", false)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            String str10 = jo70Var.a;
                            if (zoy0Var != null) {
                                lValueOf = Long.valueOf(zoy0Var.c * j2);
                            } else {
                                lValueOf = null;
                            }
                            rdf1Var = new rdf1(str5, str4, new cvt0(str10, str8, str7, str, strConcat, false, i2, z2, str2, zR, lValueOf), str3, u7hVar, string);
                        } else {
                            j2 = j2;
                            rdf1Var = new rdf1(str5, str4, (cvt0) null, str3, u7hVar, string);
                        }
                    } else {
                        j2 = j2;
                        rdf1Var = new rdf1(str5, str4, (cvt0) null, str3, u7hVar, string);
                    }
                } else {
                    u7hVar2 = new u7h(pp70Var2.c.a.c);
                }
                u7hVar = u7hVar2;
                if (jo70Var != null) {
                    list2 = jo70Var.d;
                    if (str7 != null) {
                        strI = jo70Var.b;
                        if (!list2.isEmpty()) {
                            strI = xcg1.i(strI, " • ", ((ho70) list2.get(0)).a);
                        }
                        String str11 = strI;
                        zY = nhc1.Y(str6, "spotify:podcast-chapter", false);
                        boolean zR2 = l4o1.R(zoy0Var);
                        if (zY) {
                            str = str6;
                        } else {
                            str = str6;
                        }
                        if (nhc1.Y(str, "spotify:artist:", false)) {
                            strConcat = "spotify:list:popular-release-segments-main-roles:artist_".concat(ihc1.X0(str, ":artist:"));
                        } else {
                            strConcat = str;
                        }
                        mq70Var2 = xkk1Var.b;
                        if (mq70Var2 != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (zY) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (nhc1.Y(str, "spotify:artist:", false)) {
                            i = 2;
                            i2 = i;
                        } else {
                            i = 2;
                            i2 = i;
                        }
                        if (nhc1.Y(str, "spotify:author:", false)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        String str12 = jo70Var.a;
                        if (zoy0Var != null) {
                            lValueOf = Long.valueOf(zoy0Var.c * j2);
                        } else {
                            lValueOf = null;
                        }
                        rdf1Var = new rdf1(str5, str4, new cvt0(str12, str11, str7, str, strConcat, false, i2, z2, str2, zR2, lValueOf), str3, u7hVar, string);
                    } else {
                        j2 = j2;
                        rdf1Var = new rdf1(str5, str4, (cvt0) null, str3, u7hVar, string);
                    }
                } else {
                    j2 = j2;
                    rdf1Var = new rdf1(str5, str4, (cvt0) null, str3, u7hVar, string);
                }
            }
            arrayList3.add(rdf1Var);
            j2 = j2;
            j = 0;
        }
        return new qdf1(arrayList3);
    }

    public static Next p(kak0 kak0Var, l3k0 l3k0Var) {
        zck0 zck0Var = l3k0Var.a;
        if (kak0Var.e instanceof odm0) {
            return Next.j();
        }
        vcu0 vcu0Var = null;
        if (zck0Var instanceof zck0) {
            ruq0 ruq0Var = kak0Var.S0.b;
            zck0 zck0Var2 = zck0Var;
            String str = zck0Var2.c;
            boolean z = zck0Var2.d;
            String str2 = ruq0Var.a;
            String str3 = ruq0Var.d;
            String str4 = ruq0Var.b;
            String str5 = ruq0Var.c;
            boolean z2 = str.equals(str2) || str.equals(str5);
            if (z2 || str.equals(str4) || str.equals(str3)) {
                z = z2 && (!(u890.j(ruq0Var.a, str4) || u890.j(str5, str3)) || z);
            }
            if (z) {
                vcu0Var = new vcu0(zck0Var2.a, zck0Var2.b);
            }
        } else if (zck0Var instanceof adk0) {
            vcu0Var = wcu0.a;
        } else {
            if (!(zck0Var instanceof yck0)) {
                eg.o();
                return null;
            }
            vcu0Var = rcu0.a;
        }
        vcu0 vcu0Var2 = vcu0Var;
        return vcu0Var2 != null ? Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, vcu0Var2, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -65, 1048575)) : Next.j();
    }

    public static final Object q(iu30 iu30Var, onm onmVar) {
        return h(onmVar.getContext()).D(new gla0(iu30Var, (byte) 2), onmVar);
    }

    public static final Object r(iu30 iu30Var, onm onmVar) {
        return h(onmVar.getContext()).D(iu30Var, onmVar);
    }
}
