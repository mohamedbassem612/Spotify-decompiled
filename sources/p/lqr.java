package p;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lqr implements Function, qiw, ctf1, ya, zdg, ObservableOnSubscribe, BiFunction {
    public final /* synthetic */ byte a;
    public final Object b;

    public lqr() {
        this.a = (byte) 9;
        this.b = new idd1(n0r.V0);
    }

    public ydg a(heg hegVar) {
        ydg ydgVarA;
        hzq0 hzq0Var = (hzq0) this.b;
        kf30 kf30Var = hegVar.a;
        ArrayList<zbc> arrayList = new ArrayList();
        men1.p(hzq0Var, kf30Var, arrayList);
        for (zbc zbcVar : arrayList) {
            if ((zbcVar instanceof zbc) && (ydgVarA = zbcVar.t.a(hegVar)) != null) {
                return ydgVarA;
            }
        }
        return null;
    }

    public boolean accept(Object obj) {
        return ((fq4) this.b).a();
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ian ianVar = (ian) obj;
                nqr nqrVar = (nqr) obj2;
                return ((man) nqrVar.t.getValue()).a(ianVar.a()).doOnNext(new yrh(nqrVar, (byte) 18)).doOnComplete(new bm0(ianVar, nqrVar, (byte) 19));
            case 5:
                return yoi1.h(((lkd) obj2).c((ContextTrack) obj), o6x.a);
            case 6:
                return (mvh1) obj2;
            case 16:
                n980 n980Var = (n980) ((bk1) obj2).b;
                return n980Var.a.flatMapCompletable(new il00(n980Var, (byte) 14)).x(new c011(false));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return !((l811) obj2).a ? Observable.just(new eoh0(0), new foh0(2)) : Observable.just(new foh0(1));
            case 22:
                obj.getClass();
                return (CompletableSource) ((xaj1) obj2).invoke(obj);
            default:
                return ((zeu) obj2).u(((GetEntityResponse) obj).n().n().n());
        }
    }

    public void b(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0VarX;
        jsl jslVar;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1687910334);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(kvvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var2.g(this) : x340Var2.i(this) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            Uri uri = Uri.parse(kvvVar.i);
            boolean z2 = kvvVar.d;
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var2.i(this)));
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new f2t((Object) this, (Object) iu30Var, (byte) 21);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            fwx fwxVarG = hso1.G(z2 ? xmx.c : grx.c, 0L, 0L, x340Var2, 8, 30);
            x340Var2.i0(-1415787213);
            qim0 qim0Var = nim0.a;
            if (z2) {
                boolean zG = x340Var2.g(function0);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new z9t(function0, (byte) 19);
                    x340Var2.s0(objT2);
                }
                qim0VarX = bin.x(qim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15);
            } else {
                qim0VarX = qim0Var;
            }
            x340Var2.r(false);
            qim0 qim0VarN = anm1.N("CHANGE_IMAGE_ARTWORK", qim0VarX);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z4 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var2, 2359296, 0, 130974);
            if (z2) {
                x340Var2.i0(-93598135);
                jslVar = new jsl(cwl1.o0(x340Var2, 2131955260));
                x340Var2.r(false);
            } else {
                x340Var2.i0(-93435726);
                x340Var2.r(false);
                jslVar = isl.a;
            }
            eso1.h(ni7VarA, jslVar, (qim0) null, new p3v(112.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var2, 3072, 500);
            x340Var = x340Var2;
            if (uri.equals(Uri.EMPTY) || !z2) {
                z = true;
                x340Var.i0(-92628982);
                x340Var.r(false);
            } else {
                x340Var.i0(-93306487);
                qim0 qim0VarA = h2c.a.a(uyn1.x(qim0Var, 10.0f), een.Y);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                cwl1.b(anm1.N("CHANGE_IMAGE_ARTWORK_PEN_ICON", u291.r(u291.B(qim0Var, (gra) null, 3), 32.0f)), (tl3) null, er31.a, new jgx(18), new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, tki.a, x340Var, 24582, 48, 2018);
                x340Var = x340Var;
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(this, kvvVar, iu30Var, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public String c(ie30 ie30Var) {
        String displayName;
        String str = ie30Var.d;
        String str2 = ie30Var.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = zoi1.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strK = k(displayName, d(ie30Var));
        if (!TextUtils.isEmpty(strK)) {
            return strK;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public String d(ie30 ie30Var) {
        Resources resources = (Resources) this.b;
        int i = ie30Var.f;
        String string = (i & 2) != 0 ? resources.getString(2131955825) : "";
        if ((i & 4) != 0) {
            string = k(string, resources.getString(2131955828));
        }
        if ((i & 8) != 0) {
            string = k(string, resources.getString(2131955827));
        }
        return (i & 1088) != 0 ? k(string, resources.getString(2131955826)) : string;
    }

    public e481 e(String str) {
        e481 e481Var = (e481) ((idd1) this.b).getValue();
        return new e481(e481Var.a, e481Var.b, e481Var.c, e481Var.d, e481Var.e, e481Var.f, e481Var.g, e481Var.h, e481Var.i, e481Var.j, e481Var.k, e481Var.l, e481Var.m, str, e481Var.o, e481Var.p, e481Var.q, e481Var.r);
    }

    public ArtworkView f() {
        return ((mmy) this.b).findViewById(2131428690);
    }

    public zzq0 g(int i, int i2, int i3, nyy nyyVar, nyy nyyVar2) {
        float f;
        float f2;
        float f3;
        boolean z = nyyVar2 != null && nyyVar2.a;
        if (nyyVar.a) {
            return new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (nyyVar != nyy.CARD) {
            if (nyyVar == nyy.ROW) {
                return new zzq0(0.0f, z ? 0.0f : 8.0f, 0.0f, 8.0f);
            }
            if (nyyVar == nyy.BANNER) {
                return new zzq0(0.0f, nyyVar2 != null ? 8.0f : 16.0f, 0.0f, 0.0f);
            }
            return new zzq0(16.0f, z ? 0.0f : 8.0f, 16.0f, 8.0f);
        }
        int i4 = ((sw9) this.b).b;
        boolean z2 = (i - i2) + i4 >= i3;
        if (i2 < 0) {
            hhg1.n("Failed requirement.");
            return null;
        }
        if (i4 <= i2) {
            hhg1.n("Failed requirement.");
            return null;
        }
        boolean z3 = i2 == 0;
        int i5 = i4 - 1;
        boolean z4 = i2 == i5;
        float f4 = i4;
        float f5 = 16.0f / f4;
        float f6 = i2;
        float f7 = f6 * f5;
        float f8 = (i5 - i2) * f5;
        float f9 = (i5 * 16.0f) / f4;
        if (z3 && z4) {
            f = 16.0f + f5;
        } else if (z3) {
            f = 16.0f;
        } else {
            f = z4 ? (f5 - f7) + f9 : (((f5 - f7) + f8) - (f6 * f9)) + (f6 * 16.0f);
        }
        if (z3 && z4) {
            f3 = f5 + 16.0f;
        } else {
            if (z3) {
                f2 = f5 - f8;
            } else if (z4) {
                f3 = 16.0f;
            } else {
                f2 = (((f5 + f7) - f8) + (f6 * f9)) - (f6 * 16.0f);
            }
            f3 = f2 + f9;
        }
        return new zzq0(f, z ? 0.0f : 16.0f, f3, z2 ? 0.0f : 16.0f);
    }

    public View h() {
        return ((mmy) this.b).findViewById(2131428691);
    }

    public ld50 i() {
        zor0 zor0Var = (s5) this.b;
        if (!(zor0Var instanceof zor0)) {
            return new ld50();
        }
        ArrayList arrayList = zor0Var.b.b;
        ld50 ld50Var = new ld50();
        ld50Var.a.addAll(arrayList);
        return ld50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, onm onmVar) {
        j9z j9zVar;
        if (onmVar instanceof j9z) {
            j9zVar = (j9z) onmVar;
            int i = j9zVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j9zVar.d = i - Integer.MIN_VALUE;
            } else {
                j9zVar = new j9z(this, onmVar);
            }
        } else {
            j9zVar = new j9z(this, onmVar);
        }
        Object objD = j9zVar.b;
        int i2 = j9zVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            jn7 jn7Var = (jn7) this.b;
            p831 p831VarP = ResumptionProgressEsperanto.GetResumePointRequest.p();
            p831VarP.q(str);
            p831VarP.r("episode_share");
            p831VarP.s("episode_share");
            ResumptionProgressEsperanto.GetResumePointRequest getResumePointRequestBuild = p831VarP.build();
            j9zVar.a = str;
            j9zVar.d = 1;
            objD = jn7Var.D(getResumePointRequestBuild, j9zVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = j9zVar.a;
            hm5.M(objD);
        }
        ResumptionProgressEsperanto.ItemResumePoint itemResumePoint = (ResumptionProgressEsperanto.ItemResumePoint) ((ResumptionProgressEsperanto.GetResumePointResponse) objD).o().get(str);
        if (itemResumePoint != null && itemResumePoint.o() == r831.c && itemResumePoint.q()) {
            return new Long(itemResumePoint.p().o().p() * 1000);
        }
        return null;
    }

    public String k(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.b).getString(2131955821, string, str);
            }
        }
        return string;
    }

    public void l(long j) {
        myr myrVar = (myr) this.b;
        bt00 bt00Var = myrVar.p;
        dm5.m(j >= 0 || j == -9223372036854775807L);
        bt00Var.b = j;
        pgg1 pgg1Var = myrVar.r;
        pgg1Var.getClass();
        pgg1Var.d();
        pgg1Var.i.d((Object) null, 4, 0, 0).b();
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ObservableEmitter observableEmitterSerialize = observableEmitter.serialize();
                rzq rzqVar = (rzq) obj;
                ckv ckvVar = new ckv(observableEmitterSerialize, rzqVar, (byte) 0);
                rzqVar.a(ckvVar);
                if (!observableEmitterSerialize.isDisposed()) {
                    observableEmitterSerialize.onNext(don1.o(rzqVar.j()));
                }
                observableEmitterSerialize.setCancellable(new pc6(rzqVar, ckvVar, (byte) 5));
                break;
            default:
                zeu zeuVar = (zeu) obj;
                ((CopyOnWriteArraySet) zeuVar.b).add(observableEmitter);
                Iterator it = ((CopyOnWriteArraySet) zeuVar.a).iterator();
                while (it.hasNext()) {
                    ((iu30) it.next()).invoke(observableEmitter);
                }
                observableEmitter.setCancellable(new pc6(zeuVar, observableEmitter, (byte) 6));
                break;
        }
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                Long l = (Long) obj;
                jnq jnqVar = (jnq) obj2;
                TextView textView = (TextView) ((g1i) jnqVar.c).c;
                l.getClass();
                textView.setText(jnqVar.b(2131820652, l.longValue()));
                break;
            case 2:
                mmr0 mmr0Var = (mmr0) obj;
                String str = (String) mmr0Var.a;
                String str2 = (String) mmr0Var.b;
                TextView textView2 = (TextView) ((d520) ((odr) obj2).c).d;
                if (str.length() <= 0) {
                    str = str2;
                }
                textView2.setText(str);
                break;
            case 7:
                ((TextView) ((uhs) obj2).f.e).setText((String) obj);
                break;
            case 8:
                jxw0 jxw0Var = (jxw0) obj;
                iis iisVar = (iis) obj2;
                Function0 function0 = iisVar.b;
                int i = jxw0Var.a;
                String str3 = jxw0Var.d;
                String str4 = jxw0Var.b;
                boolean z = jxw0Var.f;
                String str5 = jxw0Var.c;
                if (i != iisVar.l) {
                    iisVar.j = null;
                }
                int iC = l1d.C(i);
                if (iC == 0) {
                    if (iisVar.l != 1) {
                        ug3 ug3Var = new ug3(iisVar.d, iisVar.c, new gis(iisVar, (byte) 4), new gis(iisVar, (byte) 5));
                        tka0 tka0Var = dtw.C;
                        View view = mhc.b(iisVar.a().getContext(), iisVar.a(), ug3Var, new qgq0(str4, str5, str3, z), (ipb1) null, 112).w;
                        FrameLayout frameLayoutA = iisVar.a();
                        if (frameLayoutA.indexOfChild(view) == -1) {
                            if (frameLayoutA.getChildCount() > 1) {
                                if (frameLayoutA.getChildCount() <= 0) {
                                    bhn0.t("Sequence is empty.");
                                } else {
                                    View childAt = frameLayoutA.getChildAt(0);
                                    if (childAt == null) {
                                        tw20.p();
                                    } else {
                                        childAt.setVisibility(4);
                                    }
                                }
                            }
                            frameLayoutA.addView(view);
                            frameLayoutA.post(new a6n(frameLayoutA, (byte) 8));
                        }
                    }
                    iisVar.l = 1;
                    break;
                } else if (iC == 1) {
                    if (iisVar.l != 2) {
                        bs0 bs0Var = new bs0(iisVar.e, new vas(iisVar, (byte) 8), new gis(iisVar, (byte) 0));
                        tka0 tka0Var2 = dtw.C;
                        iis.b(mhc.b(iisVar.a().getContext(), iisVar.a(), bs0Var, new wju(str5, z), (ipb1) null, 112).w, iisVar.a(), iisVar.a);
                    }
                    iisVar.l = 2;
                } else if (iC == 2) {
                    if (iisVar.l != 3) {
                        ug3 ug3Var2 = new ug3(iisVar.f, new gis(iisVar, (byte) 1), new gis(iisVar, (byte) 2), new gis(iisVar, (byte) 3));
                        tka0 tka0Var3 = dtw.C;
                        iis.b(mhc.b(iisVar.a().getContext(), iisVar.a(), ug3Var2, new ycx0(str4, str5, str3, z), (ipb1) null, 112).w, iisVar.a(), function0);
                    }
                    iisVar.l = 3;
                } else if (iC != 3) {
                    eg.o();
                } else {
                    l431 l431Var = new l431(jxw0Var.e, jxw0Var.f, jxw0Var.b, jxw0Var.c, jxw0Var.d);
                    dtw dtwVar = iisVar.j;
                    if (dtwVar != null) {
                        dtwVar.f(l431Var);
                    } else {
                        bs0 bs0Var2 = new bs0(iisVar.g, new gis(iisVar, (byte) 6), new gis(iisVar, (byte) 7));
                        tka0 tka0Var4 = dtw.C;
                        dtw dtwVarB = mhc.b(iisVar.a().getContext(), iisVar.a(), bs0Var2, l431Var, (ipb1) null, 112);
                        iisVar.j = dtwVarB;
                        iis.b(dtwVarB.w, iisVar.a(), function0);
                    }
                    iisVar.l = 4;
                }
                break;
            default:
                int i2 = pkf1.t2;
                ((pkf1) obj2).D0((ikf1) obj, false);
                break;
        }
    }

    public lqr(mbx mbxVar, y570 y570Var) {
        this.a = (byte) 25;
        this.b = y570Var;
    }

    public /* synthetic */ lqr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public lqr(Resources resources) {
        this.a = (byte) 11;
        resources.getClass();
        this.b = resources;
    }

    public Object apply(Object obj, Object obj2) {
        return mbx.e((y570) this.b, ((Boolean) obj2).booleanValue(), ((Boolean) obj).booleanValue());
    }
}
