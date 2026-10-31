package p;

import android.content.res.Resources;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import com.spotify.recents.recentsdatasourceimpl.Share;
import com.spotify.transcript.list.TranscriptListView;
import com.spotify.widgets.widgetstate.WidgetState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xaz0 implements Function, qiw, SingleOnSubscribe, qb51, hj71 {
    public final /* synthetic */ byte a;
    public final Object b;

    public xaz0(byte b) {
        this.a = b;
        switch (b) {
            case 19:
                this.b = t380.t(1, 5);
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public static /* synthetic */ t380 a(xaz0 xaz0Var) {
        return (t380) xaz0Var.b;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        boolean zBooleanValue = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((Observable) obj).flatMap(new hyy0(new n811(), ((yaz0) obj2).g, (byte) 4));
            case 1:
                nfz0 nfz0Var = (nfz0) obj;
                dma1 dma1Var = nfz0Var.a;
                bma1 bma1Var = nfz0.b;
                if (dma1Var.h(bma1Var, false)) {
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.a(bma1Var, false);
                    hma1VarEdit.g();
                    return ((ifz0) obj2).f(nfz0Var);
                }
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.a(bma1Var, false);
                hma1VarEdit2.g();
                return CompletableEmpty.a;
            case 4:
                return ((gn01) obj2).a();
            case 6:
                return new oy01((List) obj, (t45) obj2);
            case 7:
                z211 z211Var = (z211) obj2;
                return (!z211Var.a.A() || ((Boolean) obj).booleanValue()) ? z6x.a : z211Var.c.a;
            case 9:
                Set set = gj11.X;
                return ((gj11) obj2).b.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).ignoreElement();
            case 12:
                at21 at21Var = (at21) obj2;
                ffb0 ffb0Var = at21Var.c;
                gh4 gh4Var = ffb0Var.b;
                if (gh4Var.g()) {
                    Boolean bool = (Boolean) ffb0Var.c.getValue();
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else if (gh4Var.g() && ffb0Var.a.h(gfb0.a, gh4Var.f())) {
                        zBooleanValue = true;
                    }
                }
                mmr0 mmr0Var = zBooleanValue ? new mmr0(2131961312, 2131232176) : new mmr0(2131961313, 2131231870);
                int iIntValue = ((Number) mmr0Var.a).intValue();
                return rno1.m(new d1p0(Integer.valueOf(((Number) mmr0Var.b).intValue()), at21Var.b.getString(iIntValue)), new CompletableFromAction(new ruz0(at21Var, (byte) 6)), 6);
            case 17:
                return Observable.combineLatest(((vbl) obj).b.c.filter(rtw0.e), ((dxz0) obj2).e(), w1x0.i);
            case 23:
                return new CompletableFromAction(new sr51((zr51) obj2, (byte) 0)).w();
            default:
                return yoi1.i(rqt0.u(new h5y0(((od61) obj2).b.d(), (byte) 10)), o6x.a);
        }
    }

    public zu41 b() {
        return new zu41(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r6v12, types: [byte[], java.io.Serializable] */
    public Serializable c(String str, onm onmVar) throws HttpException, IOException {
        hc31 hc31Var;
        if (onmVar instanceof hc31) {
            hc31Var = (hc31) onmVar;
            int i = hc31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hc31Var.c = i - Integer.MIN_VALUE;
            } else {
                hc31Var = new hc31(this, onmVar);
            }
        } else {
            hc31Var = new hc31(this, onmVar);
        }
        Object objA = hc31Var.a;
        int i2 = hc31Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                geo geoVar = (geo) this.b;
                hc31Var.c = 1;
                objA = geoVar.a(str, hc31Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            uz21 uz21Var = (uz21) objA;
            try {
                long jD = uz21Var.d();
                if (jD > 2097152) {
                    throw new IOException("Cue audio too large: " + jD + " bytes (max 2097152)");
                }
                gbc gbcVarD1 = uz21Var.d1();
                if (gbcVarD1.request(2097153L)) {
                    throw new IOException("Cue audio exceeds 2097152 bytes");
                }
                ?? Y0 = gbcVarD1.y0();
                uz21Var.close();
                return Y0;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(uz21Var, th);
                    throw th2;
                }
            }
        } catch (HttpException e) {
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IOException("Audio download failed", e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        uz31 uz31Var;
        if (onmVar instanceof uz31) {
            uz31Var = (uz31) onmVar;
            int i = uz31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uz31Var.c = i - Integer.MIN_VALUE;
            } else {
                uz31Var = new uz31(this, onmVar);
            }
        } else {
            uz31Var = new uz31(this, onmVar);
        }
        Object objJ = uz31Var.a;
        int i2 = uz31Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ixg ixgVarF = ((gw70) this.b).f(str);
            ixgVarF.g = false;
            Single singleI = ixgVarF.i();
            uz31Var.c = 1;
            objJ = fc11.j(singleI, uz31Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public oq41 e(p5h p5hVar) {
        long jG;
        float f = p5hVar.a;
        float f2 = p5hVar.b;
        ptb0 ptb0Var = (ptb0) this.b;
        int iOrdinal = ptb0Var.q.ordinal();
        if (iOrdinal == 0) {
            jG = ptb0Var.g() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            jG = ptb0Var.g() >> 32;
        }
        return new oq41(f, ((int) jG) - f2);
    }

    public ArrayList f() {
        ptb0 ptb0Var = (ptb0) this.b;
        List list = ptb0Var.l;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new oe21((qtb0) it.next(), ptb0Var.q));
        }
        return arrayList;
    }

    public Object g(int i, WidgetState widgetState, zhv zhvVar) {
        Object objA = ((jiv) this.b).a(i, widgetState.getWidgetCategory(), new q961((Object) widgetState, (byte) 6), zhvVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    public hw41 h(String str, d8r0 d8r0Var) {
        String str2 = d8r0Var.c;
        Resources resources = (Resources) this.b;
        return new hw41(new f6x(resources.getString(2131954606, str2), resources.getString(2131954607), d8r0Var, new i6x(str)));
    }

    public hw41 i(boolean z, boolean z2, boolean z3, boolean z4, d8r0 d8r0Var) {
        int i;
        Resources resources = (Resources) this.b;
        String string = resources.getString(!z ? 2131954602 : 2131954608);
        if (z3) {
            i = 2131961561;
        } else if (z2) {
            i = z4 ? 2131961565 : 2131961564;
        } else {
            i = z4 ? 2131961562 : 2131961563;
        }
        return new hw41(new f6x(string, resources.getString(i), d8r0Var, g6x.c));
    }

    public hw41 j(d8r0 d8r0Var) {
        String str = d8r0Var.c;
        Resources resources = (Resources) this.b;
        return new hw41(new f6x(resources.getString(2131954606, str), resources.getString(2131954609), d8r0Var, h6x.c));
    }

    public Next k(z551 z551Var) {
        rx41 qx41Var;
        f951 f951Var = z551Var.d;
        if (!(f951Var instanceof s851)) {
            if ((f951Var instanceof u851) || (f951Var instanceof d951)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        s851 s851Var = (s851) f951Var;
        String strF = ejb.f();
        val valVar = z551Var.e;
        fw41 fw41Var = z551Var.f;
        String str = z551Var.a;
        hx41 hx41Var = new hx41(strF, false, valVar);
        boolean z = s851Var instanceof r851;
        u851 u851Var = u851.a;
        y851 y851Var = y851.a;
        xyn1 xyn1Var = sc51.b;
        if (!z) {
            if (s851Var instanceof p851) {
                if (str.length() == 0) {
                    return Next.i(z551.a(z551Var, null, null, 0, y851Var, null, null, null, null, null, 0, null, null, false, null, false, 32759), Effects.a(new xyn1[]{hx41Var}));
                }
                return Next.i(z551.a(z551Var, null, null, 0, u851Var, null, null, null, null, null, 0, null, null, false, null, false, 32759), Effects.a(new xyn1[]{xyn1Var, ((di4) this.b).B() ? new mx41(str, strF, (tv80) null, fw41Var.c) : new nx41(str, strF, null, fw41Var.c)}));
            }
            if (s851Var.equals(q851.a)) {
                return Next.i(z551.a(z551Var, null, null, 0, y851Var, null, null, null, null, null, 0, null, null, false, null, false, 32759), Effects.a(new xyn1[]{xyn1Var, hx41Var}));
            }
            eg.o();
            return null;
        }
        r851 r851Var = (r851) s851Var;
        if (str.length() == 0) {
            return Next.i(z551.a(z551Var, null, null, 0, y851Var, null, null, null, null, null, 0, null, null, false, null, false, 32759), Effects.a(new xyn1[]{xyn1Var, hx41Var}));
        }
        xo20 xo20Var = r851Var.a;
        List list = r851Var.e;
        if (xo20Var == null && list == null) {
            qx41Var = new rx41(z551Var.a, strF, uap1.g(z551Var), fw41Var.d, (gyh) null, (tv80) null, fw41Var.c, 48);
        } else {
            String str2 = z551Var.a;
            String strG = uap1.g(z551Var);
            int i = fw41Var.d;
            gyh gyhVar = z551Var.N0.a;
            if (gyhVar == null) {
                gyhVar = gyh.b;
            }
            qx41Var = new qx41(str2, strF, xo20Var, strG, i, null, gyhVar, fw41Var.c, r851Var.e);
        }
        ue20 ue20VarA = z551Var.h;
        te20 te20Var = ue20VarA instanceof te20 ? (te20) ue20VarA : null;
        if (te20Var != null && (list != null || te20Var.b != null)) {
            ue20VarA = te20.a(te20Var, null, strF, 1);
        }
        return Next.i(z551.a(z551Var, null, null, 0, u851Var, null, null, null, ue20VarA, null, 0, null, null, false, null, false, 32631), f46.S0(new xyn1[]{xyn1Var, qx41Var}));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(List list, onm onmVar) {
        rv01 rv01Var;
        ArrayList<mmr0> arrayList;
        Share shareP;
        Object mkh1Var;
        GroupMetadata groupMetadataS;
        ce71 be71Var;
        if (onmVar instanceof rv01) {
            rv01Var = (rv01) onmVar;
            int i = rv01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rv01Var.d = i - Integer.MIN_VALUE;
            } else {
                rv01Var = new rv01(this, onmVar);
            }
        } else {
            rv01Var = new rv01(this, onmVar);
        }
        Object obj = rv01Var.b;
        int i2 = rv01Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zuc0 zuc0Var = (zuc0) it.next();
                Map map = zuc0Var.g;
                if (map.containsKey("recent_type_shared")) {
                    String str = (String) map.get("share_metadata");
                    if (str == null || str.length() == 0) {
                        shareP = null;
                    } else {
                        try {
                            shareP = Share.p(Base64.decode(str, 0));
                        } catch (Exception e) {
                            Logger.e(e, "Failed to parse ShareMetadata proto for recents item", new Object[0]);
                            shareP = null;
                        }
                    }
                    if (shareP == null) {
                        mkh1Var = null;
                    } else if (u890.j(yxo1.x(map), "group_id_0")) {
                        String str2 = (String) map.get("group_metadata");
                        if (str2 == null) {
                            groupMetadataS = null;
                        } else {
                            try {
                                groupMetadataS = GroupMetadata.s(Base64.decode(str2, 0));
                            } catch (Exception e2) {
                                Logger.e(e2, "Failed to parse GroupMetadata proto for recents item", new Object[0]);
                                groupMetadataS = null;
                            }
                        }
                        if (groupMetadataS != null && prn1.p(zuc0Var.c, shareP, groupMetadataS)) {
                            mkh1Var = new lkh1(groupMetadataS.q(), o7h.d1(groupMetadataS.r(), 4), shareP.n());
                        } else if (shareP.o().length() > 0) {
                            mkh1Var = new mkh1(shareP.n(), shareP.o());
                        } else {
                            mkh1Var = null;
                        }
                    } else if (shareP.o().length() > 0) {
                        mkh1Var = new mkh1(shareP.n(), shareP.o());
                    } else {
                        mkh1Var = null;
                    }
                } else {
                    mkh1Var = null;
                }
                mmr0 mmr0Var = mkh1Var != null ? new mmr0(zuc0Var.c, mkh1Var) : null;
                if (mmr0Var != null) {
                    arrayList2.add(mmr0Var);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                r7h.W(((nkh1) ((mmr0) it2.next()).b).a(), arrayList3);
            }
            List listJ0 = o7h.j0(arrayList3);
            ko71 ko71Var = (ko71) this.b;
            rv01Var.a = arrayList2;
            rv01Var.d = 1;
            Object objA = ko71Var.a(listJ0, rv01Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            obj = objA;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = rv01Var.a;
            hm5.M(obj);
        }
        Map map2 = (Map) obj;
        ArrayList arrayList4 = new ArrayList();
        for (mmr0 mmr0Var2 : arrayList) {
            String str3 = (String) mmr0Var2.a;
            nkh1 nkh1Var = (nkh1) mmr0Var2.b;
            if (nkh1Var instanceof mkh1) {
                mkh1 mkh1Var2 = (mkh1) nkh1Var;
                zei1 zei1Var = (zei1) map2.get(mkh1Var2.b);
                if (zei1Var == null) {
                    be71Var = null;
                } else {
                    be71Var = new ce71(twa.x(zei1Var), mkh1Var2.a);
                }
            } else {
                if (!(nkh1Var instanceof lkh1)) {
                    eg.o();
                    return null;
                }
                lkh1 lkh1Var = (lkh1) nkh1Var;
                List list2 = lkh1Var.c;
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    zei1 zei1Var2 = (zei1) map2.get((String) it3.next());
                    hy71 hy71VarX = zei1Var2 != null ? twa.x(zei1Var2) : null;
                    if (hy71VarX != null) {
                        arrayList5.add(hy71VarX);
                    }
                }
                if (arrayList5.isEmpty()) {
                    be71Var = null;
                } else {
                    be71Var = new be71(lkh1Var.a, lkh1Var.b, arrayList5);
                }
            }
            mmr0 mmr0Var3 = be71Var != null ? new mmr0(str3, be71Var) : null;
            if (mmr0Var3 != null) {
                arrayList4.add(mmr0Var3);
            }
        }
        return sqg0.T(arrayList4);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public Object n(k371 k371Var, lnm lnmVar) {
        td71 td71Var;
        un71 un71Var;
        byte b = this.a;
        puk pukVar = puk.d;
        Object obj = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 28:
                if (lnmVar instanceof td71) {
                    td71Var = (td71) lnmVar;
                    int i = td71Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        td71Var.c = i - Integer.MIN_VALUE;
                    } else {
                        td71Var = new td71(this, (onm) lnmVar);
                    }
                } else {
                    td71Var = new td71(this, (onm) lnmVar);
                }
                Object objY = td71Var.a;
                int i2 = td71Var.c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objY);
                    b871 b871Var = (b871) objY;
                    return new qj71(b871Var.a, b871Var.b, pukVar);
                }
                hm5.M(objY);
                wa71 wa71Var = k371Var.a;
                if (wa71Var != null) {
                    xtu0 xtu0Var = new xtu0(wa71Var);
                    td71Var.c = 1;
                    objY = ((fdc) obj).Y(xtu0Var, td71Var);
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                    b871 b871Var2 = (b871) objY;
                    return new qj71(b871Var2.a, b871Var2.b, pukVar);
                }
                return null;
            default:
                if (lnmVar instanceof un71) {
                    un71Var = (un71) lnmVar;
                    int i3 = un71Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        un71Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        un71Var = new un71(this, (onm) lnmVar);
                    }
                } else {
                    un71Var = new un71(this, (onm) lnmVar);
                }
                Object objY2 = un71Var.a;
                int i4 = un71Var.c;
                if (i4 != 0) {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objY2);
                    b871 b871Var3 = (b871) objY2;
                    return new qj71(b871Var3.a, b871Var3.b, pukVar);
                }
                hm5.M(objY2);
                wa71 wa71Var2 = k371Var.a;
                if (wa71Var2 != null) {
                    f1g1 f1g1Var = (f1g1) obj;
                    b1g1 b1g1Var = new b1g1(wa71Var2);
                    un71Var.c = 1;
                    objY2 = fn31.Y(f1g1Var.e, new sq71(b1g1Var, f1g1Var, null), un71Var);
                    if (objY2 == d9nVar) {
                        return d9nVar;
                    }
                    b871 b871Var4 = (b871) objY2;
                    return new qj71(b871Var4.a, b871Var4.b, pukVar);
                }
                return null;
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 13:
                k811 k811Var = (k811) obj;
                if (!singleEmitter.isDisposed()) {
                    File file = ((rdu) ((ynb0) k811Var.b).get()).a;
                    if (!file.exists() || file.lastModified() == 0) {
                        singleEmitter.onSuccess(q031.a);
                    }
                    RestrictedIntegrationsResponse restrictedIntegrationsResponseR = RestrictedIntegrationsResponse.r(y520.G(file));
                    restrictedIntegrationsResponseR.getClass();
                    if (((yqg) k811Var.d).b() - file.lastModified() < restrictedIntegrationsResponseR.n() * 1000) {
                        singleEmitter.onSuccess(new r031(restrictedIntegrationsResponseR));
                    } else {
                        singleEmitter.onSuccess(new p031(restrictedIntegrationsResponseR));
                    }
                    break;
                }
                break;
            default:
                singleEmitter.onSuccess(new xs61(((Boolean) Single.create(new tz01((zs61) obj, (byte) 17)).blockingGet()).booleanValue()));
                break;
        }
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                mmr0 mmr0Var = (mmr0) obj;
                if (((Boolean) mmr0Var.a).booleanValue()) {
                    int iIntValue = ((Number) mmr0Var.b).intValue();
                    TranscriptListView transcriptListView = (TranscriptListView) ((i34) obj2).c;
                    transcriptListView.B0();
                    transcriptListView.getScroller().b(iIntValue);
                }
                break;
            default:
                ((hce1) obj2).w((List) obj);
                break;
        }
    }

    public xaz0(c9c c9cVar, ko71 ko71Var, twa twaVar) {
        this.a = (byte) 5;
        this.b = ko71Var;
    }

    public xaz0(di4 di4Var, ejb ejbVar) {
        this.a = (byte) 21;
        this.b = di4Var;
    }

    public /* synthetic */ xaz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
