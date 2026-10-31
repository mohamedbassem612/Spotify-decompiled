package p;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.aipartner.aipartnerapi.proto.Context;
import com.spotify.aipartner.aipartnerapi.proto.Device;
import com.spotify.aipartner.aipartnerapi.proto.Query;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import com.spotify.kidsentitybanning.banning.v1.BanStatusRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uxy0 implements txy0, yu30, Function, bu11, hy11, n2r {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public uxy0(sck1 sck1Var, nt01 nt01Var, Bundle bundle) {
        this.a = (byte) 29;
        hce1 hce1Var = new hce1(sck1Var.o(), new e931(nt01Var, bundle, (byte) 0), n9p1.s(sck1Var));
        tka0 tka0VarB = rc11.a.b(f931.class);
        String strO = tka0VarB.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            throw null;
        }
        f931 f931VarT = hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        c931 c931Var = f931VarT.b;
        this.b = f931VarT;
        if (bundle != null) {
            c931Var.c(bundle);
        }
        this.c = c931Var.getState();
    }

    public t45 a() {
        int iH = ((zg4) this.c).h();
        if (iH <= 0) {
            return null;
        }
        cqz0 cqz0Var = dqz0.a;
        if (dqz0.b.g(100) >= iH) {
            return null;
        }
        t45 t45VarA = ((zle1) this.b).a("push_notification_handling");
        t45VarA.h = "android-notifications-pushnotificationsv2-pushnotificationimpl";
        return t45VarA;
    }

    public Object apply(Object obj) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                ((s4z0) ((l0x0) obj3).d).a((ou80) obj2, false);
                return rih1Var;
            case 3:
                v1k v1kVar = ((lgz0) obj3).f;
                String str2 = (String) ((LoggingParams) obj2).interactionId().h();
                return ((g0l) v1kVar.b).d().map(u321.T0).distinctUntilChanged().firstOrError().timeout(5L, TimeUnit.SECONDS, (Scheduler) v1kVar.c).map(new oql(v1kVar, str2, (byte) 2)).onErrorReturn(new gal(v1kVar, str2, (byte) 4)).map(new rpv0((ry01) obj, (byte) 11));
            case 6:
                Map map = (Map) obj;
                boolean zL = y7y0.L(map);
                dp01 dp01Var = (dp01) obj3;
                boolean zC = rh11.c(map);
                r9c r9cVar = (r9c) obj2;
                if (!r9cVar.g) {
                    return dp01Var.d(r9cVar);
                }
                Single map2 = dp01Var.a.a().takeUntil(new ypa(dp01Var, (byte) 22)).takeLast(1).singleOrError().map(new m3c(dp01Var, r9cVar, zL, zC, (byte) 8));
                map2.getClass();
                return map2;
            case 9:
                Set set = (Set) obj2;
                gx01 gx01Var = (gx01) obj3;
                return ((Boolean) obj).booleanValue() ? ((Observable) gx01Var.o.getValue()).map(new iyq0(set, (byte) 1)) : gx01Var.b(set);
            case 15:
                j380 j380VarMetadata = ((ContextTrack) ((PlayerState) obj).track().b()).metadata();
                if (j380VarMetadata == null || (str = (String) j380VarMetadata.get("image_xlarge_url")) == null) {
                    str = "";
                }
                String str3 = str;
                p2o0 p2o0Var = ((zh11) obj3).a;
                tv80 tv80Var = (tv80) obj2;
                return j2h1.D((q8n) p2o0Var.g, new hgo0(p2o0Var, tv80Var != null ? tv80Var.a : null, str3, (lnm) null, (byte) 20));
            case 16:
                tqw tqwVar = (tqw) obj2;
                return ((xi11) obj3).d.a((PlayerState) obj, tqwVar != null ? n3o1.y(tqwVar) : null);
            case 22:
                q0u q0uVar = (q0u) obj;
                p021 p021Var = (p021) obj3;
                if (q0uVar instanceof o0u) {
                    p021Var.h(((o0u) q0uVar).a);
                    return rih1Var;
                }
                if (!(q0uVar instanceof p0u)) {
                    eg.o();
                    return null;
                }
                p021Var.g.m((Object) null, new x221(((Integer) obj2).intValue(), ((p0u) q0uVar).a));
                p021Var.i();
                return rih1Var;
            case 23:
                return ((Boolean) obj).booleanValue() ? yoi1.i(((zzx) obj3).a.k("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", ejp0.a), o6x.a).map(d710.T0).filter(e710.T0).distinctUntilChanged().flatMapCompletable(new ij01((xaz0) obj2, (byte) 6)) : CompletableEmpty.a;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    return Single.just(z6x.a);
                }
                va40 va40Var = (va40) ((kdy0) obj3).d;
                oa40 oa40Var = va40Var.a;
                h4a h4aVarN = BanStatusRequest.n();
                h4aVarN.n((String) obj2);
                return oa40Var.f(h4aVarN.build(), fq21.a).map(new hl00(va40Var, (byte) 8)).onErrorReturn(rdx0.f);
        }
    }

    public ResolveIntentRequest b(String str, Integer num, String str2, List list, Integer num2, mct0 mct0Var, Integer num3, String str3, int i) {
        i1z0 i1z0Var;
        h0u h0uVar;
        qt21 qt21VarR = ResolveIntentRequest.r();
        qt21VarR.t(str3);
        t0z0 t0z0VarO = Query.o();
        t0z0VarO.n(str2);
        i1z0 i1z0Var2 = i1z0.b;
        if (num != null) {
            try {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    i1z0Var = i1z0Var2;
                } else if (iIntValue != 1) {
                    i1z0Var = iIntValue != 2 ? null : i1z0.d;
                } else {
                    i1z0Var = i1z0.c;
                }
                if (i1z0Var != null) {
                    i1z0Var2 = i1z0Var;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        t0z0VarO.r(i1z0Var2);
        t0z0VarO.q(str);
        qt21VarR.s(t0z0VarO.build());
        cbm cbmVarR = Context.r();
        cbmVarR.s(mct0Var);
        cbmVarR.q(LocalDateTime.ofInstant(Instant.ofEpochMilli(((yqg) this.b).b()), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        zot zotVarQ = Device.q();
        zotVarQ.n((h0u) ((na) this.c).invoke());
        switch (i) {
            case 1:
                h0uVar = h0u.c;
                break;
            case 2:
            default:
                h0uVar = h0u.d;
                break;
            case 3:
                h0uVar = h0u.f;
                break;
            case 4:
                h0uVar = h0u.g;
                break;
            case 5:
                h0uVar = h0u.h;
                break;
            case 6:
                h0uVar = h0u.X;
                break;
            case 7:
                h0uVar = h0u.i;
                break;
            case 8:
                h0uVar = h0u.t;
                break;
        }
        zotVarQ.q(h0uVar);
        cbmVarR.n(zotVarQ.build());
        if (num3 != null) {
            cbmVarR.r(num3.intValue() == 1 ? o8i0.c : o8i0.b);
        }
        qt21VarR.q(cbmVarR.build());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).intValue() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            f131 f131Var = iIntValue2 != 0 ? iIntValue2 != 1 ? null : f131.c : f131.b;
            if (f131Var != null) {
                arrayList2.add(f131Var);
            }
        }
        qt21VarR.n(o7h.j0(arrayList2));
        if (num2 != null) {
            qt21VarR.r(num2.intValue());
        }
        return qt21VarR.build();
    }

    public xu30 d() {
        return new f2z0((w3l0) this.b, (byte) 28);
    }

    public h3h1 e(String str) {
        return new h3h1(new us11(this, str, (byte) 0));
    }

    public h3h1 f(String str) {
        return new h3h1(new us11(this, str, (byte) 4));
    }

    public w7h1 g(n8h1 n8h1Var, unb1 unb1Var, String str) {
        u3l0 u3l0Var = (u3l0) n8h1Var;
        du11 du11Var = ((ms11) this.c).h;
        if (du11Var != null) {
            return du11Var.c(u3l0Var.b(), unb1Var, str);
        }
        return null;
    }

    public ymd0 getState() {
        return (ymd0) this.c;
    }

    public h3h1 h(String str) {
        return new h3h1(new us11(this, str, (byte) 1));
    }

    public w7h1 i(n8h1 n8h1Var, unb1 unb1Var, String str) {
        u3l0 u3l0Var = (u3l0) n8h1Var;
        du11 du11Var = ((ms11) this.c).h;
        if (du11Var != null) {
            return du11Var.h(str, u3l0Var.b());
        }
        return null;
    }

    public h3h1 j(String str) {
        return new h3h1(new us11(this, str, (byte) 5));
    }

    public h3h1 k(String str) {
        return new h3h1(new us11(this, str, (byte) 3));
    }

    public xt61 l() {
        ztx ztxVar = ztx.c;
        fah1 fah1Var = (fah1) this.c;
        kdy0 kdy0Var = (kdy0) this.b;
        g58 g58Var = (g58) kdy0Var.c;
        kdy0 kdy0Var2 = g58Var.c;
        mzy0 mzy0Var = mzy0.d;
        return new xt61(ztxVar, (Integer) null, (Integer) null, fah1Var, mqo1.s(new sq61[]{kdy0Var.g(kdy0.d(kdy0Var2, mzy0Var, mzy0Var, true, 4), false), kdy0Var.g(kdy0.d(g58Var.c, mzy0Var, mzy0Var, true, 4), true)}), 105);
    }

    public ArrayList m(String str) {
        kuw0 kuw0Var = kuw0.d;
        jq21 jq21Var = new jq21();
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0v0 i0v0VarA = ((k1v0) it.next()).a(kuw0Var);
            if (i0v0VarA != null) {
                arrayList.add(i0v0VarA);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((rq21) ((i0v0) it2.next()).a(sq21.a, jq21Var));
        }
        return arrayList2;
    }

    public w7h1 n(n8h1 n8h1Var, unb1 unb1Var, String str) {
        u3l0 u3l0Var = (u3l0) n8h1Var;
        du11 du11Var = ((ms11) this.c).h;
        if (du11Var != null) {
            return du11Var.g(str, u3l0Var.b());
        }
        return null;
    }

    public w7h1 o(n8h1 n8h1Var, String str) {
        List listB;
        a7h1 a7h1Var;
        Integer num;
        u3l0 u3l0Var = (u3l0) n8h1Var;
        y6h1 y6h1Var = (y6h1) o7h.C0(u3l0Var.b().a);
        x6h1 x6h1VarC = ((u3l0) ((f2z0) d()).invoke(Integer.valueOf((y6h1Var == null || (listB = y6h1Var.b()) == null || (a7h1Var = (a7h1) o7h.C0(listB)) == null || (num = a7h1Var.d) == null) ? 0 : num.intValue()), str, u3l0Var.b())).a.c();
        x6h1VarC.i.add(new a7h1("artwork", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
    }

    public w7h1 p(n8h1 n8h1Var, String str) {
        List listB;
        a7h1 a7h1Var;
        Integer num;
        u3l0 u3l0Var = (u3l0) n8h1Var;
        y6h1 y6h1Var = (y6h1) o7h.C0(u3l0Var.b().a);
        x6h1 x6h1VarC = ((u3l0) ((f2z0) d()).invoke(Integer.valueOf((y6h1Var == null || (listB = y6h1Var.b()) == null || (a7h1Var = (a7h1) o7h.C0(listB)) == null || (num = a7h1Var.d) == null) ? 0 : num.intValue()), str, u3l0Var.b())).a.c();
        x6h1VarC.i.add(new a7h1("artwork", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
    }

    public h3h1 q() {
        return new h3h1(ss11.f);
    }

    public void r(String str, tqw tqwVar) {
        ((dp5) this.b).g(new ms01(str, tqwVar != null ? n3o1.y(tqwVar) : null));
    }

    public w7h1 s(n8h1 n8h1Var, unb1 unb1Var, String str) {
        u3l0 u3l0Var = (u3l0) n8h1Var;
        du11 du11Var = ((ms11) this.c).h;
        if (du11Var != null) {
            return du11Var.a(u3l0Var.b(), unb1Var, str);
        }
        return null;
    }

    public Bundle serialize() {
        return ((f931) this.b).b.serialize();
    }

    public void start() {
        ((f931) this.b).b.start();
    }

    public void stop() {
        ((f931) this.b).b.stop();
    }

    public h3h1 t(String str) {
        return new h3h1(new us11(this, str, (byte) 2));
    }

    public void u(int i, int[] iArr) {
        bi40 bi40Var;
        bi40 bi40Var2;
        bi40 bi40Var3;
        ai40 ai40Var = (ai40) this.b;
        if (i == 0) {
            hhg1.n("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            hhg1.n("No data bytes provided");
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        int i2 = 1;
        int i3 = 0;
        if (i >= arrayList.size()) {
            bi40 bi40Var4 = (bi40) l1d.i(1, arrayList);
            int size = arrayList.size();
            while (size <= i) {
                int[] iArr2 = {i2, ai40Var.a[(size - 1) + (ai40Var.f ? 1 : 0)]};
                if (iArr2[i3] == 0) {
                    int i4 = i2;
                    while (i4 < 2 && iArr2[i4] == 0) {
                        i4++;
                    }
                    if (i4 == 2) {
                        iArr2 = new int[]{i3};
                    } else {
                        int i5 = 2 - i4;
                        int[] iArr3 = new int[i5];
                        System.arraycopy(iArr2, i4, iArr3, i3, i5);
                        iArr2 = iArr3;
                    }
                }
                ai40 ai40Var2 = bi40Var4.a;
                if (!ai40Var2.equals(ai40Var)) {
                    hhg1.n("GenericGFPolys do not have same GenericGF field");
                    return;
                }
                int[] iArr4 = bi40Var4.b;
                if (iArr4[i3] == 0 || iArr2[i3] == 0) {
                    bi40Var4 = ai40Var2.c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i2];
                    int i6 = i3;
                    while (i6 < length2) {
                        int i7 = iArr4[i6];
                        while (i3 < length3) {
                            int i8 = i6 + i3;
                            iArr5[i8] = iArr5[i8] ^ ai40Var2.a(i7, iArr2[i3]);
                            i3++;
                            iArr4 = iArr4;
                        }
                        i6++;
                        i3 = 0;
                    }
                    bi40Var4 = new bi40(ai40Var2, iArr5);
                }
                arrayList.add(bi40Var4);
                size++;
                i2 = 1;
                i3 = 0;
            }
        }
        bi40 bi40Var5 = (bi40) arrayList.get(i);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        if (length == 0) {
            bhn0.q();
            return;
        }
        if (length > 1 && iArr6[0] == 0) {
            int i9 = 1;
            while (i9 < length && iArr6[i9] == 0) {
                i9++;
            }
            if (i9 == length) {
                iArr6 = new int[]{0};
            } else {
                int i10 = length - i9;
                int[] iArr7 = new int[i10];
                System.arraycopy(iArr6, i9, iArr7, 0, i10);
                iArr6 = iArr7;
            }
        }
        if (i < 0) {
            bhn0.q();
            return;
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i];
        for (int i11 = 0; i11 < length4; i11++) {
            iArr8[i11] = ai40Var.a(iArr6[i11], 1);
        }
        bi40 bi40Var6 = new bi40(ai40Var, iArr8);
        ai40 ai40Var3 = bi40Var5.a;
        int[] iArr9 = bi40Var5.b;
        boolean zEquals = ai40Var.equals(ai40Var3);
        bi40 bi40Var7 = ai40Var.c;
        if (!zEquals) {
            hhg1.n("GenericGFPolys do not have same GenericGF field");
            return;
        }
        if (iArr9[0] == 0) {
            hhg1.n("Divide by 0");
            return;
        }
        int i12 = iArr9[(iArr9.length - 1) - bi40Var5.b()];
        if (i12 == 0) {
            throw new ArithmeticException();
        }
        int i13 = ai40Var.a[(ai40Var.d - ai40Var.b[i12]) - 1];
        bi40 bi40VarA = bi40Var7;
        while (true) {
            int[] iArr10 = bi40Var6.b;
            if (bi40Var6.b() < bi40Var5.b() || iArr10[0] == 0) {
                break;
            }
            int iB = bi40Var6.b() - bi40Var5.b();
            int iA = ai40Var.a(iArr10[(iArr10.length - 1) - bi40Var6.b()], i13);
            ai40 ai40Var4 = bi40Var5.a;
            if (iB < 0) {
                bhn0.q();
                return;
            }
            if (iA == 0) {
                bi40Var2 = ai40Var4.c;
                bi40Var = bi40Var5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + iB];
                int i14 = 0;
                while (i14 < length5) {
                    iArr11[i14] = ai40Var4.a(iArr9[i14], iA);
                    i14++;
                    bi40Var5 = bi40Var5;
                }
                bi40Var = bi40Var5;
                bi40Var2 = new bi40(ai40Var4, iArr11);
            }
            if (iB < 0) {
                bhn0.q();
                return;
            }
            if (iA == 0) {
                bi40Var3 = bi40Var7;
            } else {
                int[] iArr12 = new int[iB + 1];
                iArr12[0] = iA;
                bi40Var3 = new bi40(ai40Var, iArr12);
            }
            bi40VarA = bi40VarA.a(bi40Var3);
            bi40Var6 = bi40Var6.a(bi40Var2);
            bi40Var5 = bi40Var;
        }
        int[] iArr13 = new bi40[]{bi40VarA, bi40Var6}[1].b;
        int length6 = i - iArr13.length;
        for (int i15 = 0; i15 < length6; i15++) {
            iArr[length + i15] = 0;
        }
        System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
    }

    public List v() {
        return (List) ((idd1) this.c).getValue();
    }

    public int w() {
        int[] appWidgetIds;
        AppWidgetManager appWidgetManager = (AppWidgetManager) this.c;
        if (appWidgetManager == null || (appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName((android.content.Context) this.b, "com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider"))) == null) {
            return 0;
        }
        return appWidgetIds.length;
    }

    public nq21 x(String str, Intent intent) {
        mq21 mq21Var;
        nq21 nq21VarB;
        Iterator it = m(str).iterator();
        do {
            boolean zHasNext = it.hasNext();
            mq21Var = mq21.a;
            if (!zHasNext) {
                return mq21Var;
            }
            nq21VarB = ((rq21) it.next()).b(intent);
        } while (nq21VarB.equals(mq21Var));
        return nq21VarB;
    }

    public adn0 y(adn0 adn0Var) {
        h26 h26Var;
        adn0 adn0VarA;
        adn0 adn0VarA2;
        adn0 adn0VarA3;
        h26 h26Var2 = (h26) this.b;
        Integer numValueOf = Integer.valueOf(h26Var2.d);
        if (u890.j(adn0Var.a, numValueOf)) {
            h26Var = h26Var2;
            adn0VarA = adn0.a(adn0Var, (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16383);
        } else {
            h26Var = h26Var2;
            adn0VarA = adn0.a(adn0.a(adn0Var, numValueOf, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16381), (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, dm61.x0(zcn0.a, adn0Var.m), 8191);
        }
        adn0 adn0VarA4 = adn0.a(adn0.a(adn0.a(adn0.a(adn0VarA, (Integer) null, h26Var.q, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16379), (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, h26Var.h, 0, false, (Set) null, 15359), (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, h26Var.g, false, (Set) null, 14335), (Integer) null, false, false, false, h26Var.p, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16351);
        int i = h26Var.e;
        int i2 = h26Var.f;
        if (new mmr0(Integer.valueOf(adn0VarA4.h), Integer.valueOf(adn0VarA4.i)).equals(new mmr0(Integer.valueOf(i), Integer.valueOf(i2)))) {
            adn0VarA2 = adn0.a(adn0VarA4, (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16383);
        } else {
            adn0VarA2 = adn0.a(adn0.a(adn0VarA4, (Integer) null, false, false, false, false, false, (ArrayList) null, i, i2, 0, 0, false, (Set) null, 15615), (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, dm61.x0(zcn0.b, adn0VarA4.m), 8191);
        }
        adn0 adn0VarA5 = adn0.a(adn0VarA2, (Integer) null, false, false, false, false, h26Var.c, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16319);
        ArrayList arrayList = (ArrayList) this.c;
        if (u890.j(adn0VarA5.g, arrayList)) {
            adn0VarA3 = adn0.a(adn0VarA5, (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16383);
        } else {
            adn0VarA3 = adn0.a(adn0.a(adn0VarA5, (Integer) null, false, false, false, false, false, arrayList, 0, 0, 0, 0, false, (Set) null, 16255), (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, dm61.x0(zcn0.c, adn0VarA5.m), 8191);
        }
        return adn0.a(adn0.a(adn0.a(adn0VarA3, (Integer) null, false, h26Var.a, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16375), (Integer) null, false, false, h26Var.b, false, false, (ArrayList) null, 0, 0, 0, 0, false, (Set) null, 16367), (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, h26Var.o, (Set) null, 12287);
    }

    public /* synthetic */ uxy0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public uxy0(zle1 zle1Var, zg4 zg4Var) {
        this.a = (byte) 0;
        cqz0 cqz0Var = dqz0.a;
        this.b = zle1Var;
        this.c = zg4Var;
    }

    public uxy0(dp5 dp5Var, jxa jxaVar, ov20 ov20Var) {
        this.a = (byte) 8;
        this.b = dp5Var;
        this.c = yoi1.i(rqt0.u(new p3t(((bw20) ov20Var).a, (byte) 23)), o6x.a);
    }

    public uxy0(List list) {
        this.a = (byte) 26;
        this.b = list;
        this.c = new idd1(new g521(this, (byte) 8));
    }

    public uxy0(ai40 ai40Var) {
        this.a = (byte) 12;
        this.b = ai40Var;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new bi40(ai40Var, new int[]{1}));
    }

    public uxy0(ConstraintLayout constraintLayout, mlw0 mlw0Var, RecyclerView recyclerView) {
        this.a = (byte) 10;
        this.b = constraintLayout;
        this.c = mlw0Var;
    }
}
