package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusRequest;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.home.funkispage.v1.proto.Feed;
import com.spotify.home.funkispage.v1.proto.Feeds;
import com.spotify.kidsgraduation.v1.RespondToGraduationRequest;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dqu implements ya, Function, b8k0, BiFunction, yu30, qiw, fq50, u02 {
    public final /* synthetic */ byte a;
    public Object b;

    public dqu(byte b) {
        this.a = b;
        switch (b) {
            case 29:
                break;
            default:
                FormatType formatType = FormatType.FULLSCREEN;
                FormatType formatType2 = FormatType.MODAL;
                FormatType formatType3 = FormatType.WEB_VIEW;
                FormatType formatType4 = FormatType.BOTTOMSHEET;
                FormatType formatType5 = FormatType.TOOLTIP;
                FormatType formatType6 = FormatType.SNACKBAR;
                mmr0 mmr0Var = new mmr0(formatType, f46.S0(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
                mmr0 mmr0Var2 = new mmr0(formatType2, f46.S0(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
                mmr0 mmr0Var3 = new mmr0(formatType3, f46.S0(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
                mmr0 mmr0Var4 = new mmr0(formatType4, f46.S0(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
                mmr0 mmr0Var5 = new mmr0(formatType5, f46.S0(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
                FormatType formatType7 = FormatType.BANNER;
                this.b = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, new mmr0(formatType7, f46.S0(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType7})), new mmr0(formatType6, f46.S0(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}))});
                break;
        }
    }

    public Object a(Object obj) {
        return ((ov00) obj).type();
    }

    public boolean accept(Object obj) {
        return ((jq4) this.b).f();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0205  */
    public Object apply(Object obj) {
        boolean z;
        switch (this.a) {
            case 2:
                PlayerState playerState = (PlayerState) obj;
                if (!((gh4) ((dbv) this.b).d).k()) {
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    z = contextTrack != null ? l4o1.p(contextTrack) : false;
                }
                return Boolean.valueOf(z);
            case 3:
                z310 z310Var = (z310) this.b;
                List list = (List) obj;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : list) {
                    linkedHashMap.put(((qfd) obj2).a, obj2);
                }
                List list2 = z310Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    qfd qfdVar = (qfd) linkedHashMap.get(((u310) obj3).a);
                    if (qfdVar != null ? qfdVar.b : true) {
                        arrayList.add(obj3);
                    }
                }
                return z310.a(z310Var, arrayList, null, 14);
            case 4:
            case 7:
            case 12:
            case 13:
            case 14:
            case 16:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            case 23:
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
            default:
                sy21 sy21Var = (sy21) obj;
                if (sy21Var.a.Q0) {
                    return mu60.a;
                }
                uz21 uz21Var = sy21Var.c;
                return new lu60(uz21Var != null ? ut60.b(uz21Var, (nfa0) this.b) : null);
            case 5:
                kmw kmwVar = (kmw) this.b;
                g3b1 g3b1Var = kmwVar.b;
                yp40 yp40VarN = GetSessionStatusRequest.n();
                yp40VarN.n(kmwVar.a.Z());
                return g3b1Var.b(yp40VarN.build()).compose(new dn81((byte) 2)).map(pzs0.a1).onErrorReturn(qzs0.b1);
            case 6:
                return new d320(new ryw(((uww) this.b).a, (String) null));
            case 8:
                return ((zeu) this.b).u(((GetEntityResponse) obj).n().o().s());
            case 9:
                f7h f7hVar = (f7h) ((Map) obj).get(((o2z) this.b).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.c : false);
            case 10:
                f7h f7hVar2 = (f7h) ((Map) obj).get(((haz) this.b).a);
                return Boolean.valueOf(f7hVar2 != null ? f7hVar2.c : false);
            case 11:
                d9u0 d9u0Var = (d9u0) obj;
                return ((ruz) this.b).c(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(d9u0Var.b).build()).pauseOrigin(PauseResumeOrigin.builder(d9u0Var.a).build()).build());
            case 15:
                return ((c610) this.b).a((r9c) obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new j1n1(new bvo0(((m0n1) this.b).c, new cae0(((Throwable) obj).getLocalizedMessage())));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return yoi1.h(((lkd) this.b).c((ContextTrack) obj), o6x.a);
            case 22:
                return new ki40(((pi40) this.b).a, (List) obj);
            case 25:
                xb50 xb50Var = (xb50) obj;
                boolean z2 = xb50Var.b;
                f0b0 f0b0Var = (f0b0) this.b;
                String str = xb50Var.a;
                sx21 sx21VarN = RespondToGraduationRequest.n();
                sx21VarN.n(str);
                sx21VarN.q(z2);
                RespondToGraduationRequest respondToGraduationRequest = (RespondToGraduationRequest) sx21VarN.build();
                g0b0 g0b0Var = f0b0Var.a;
                respondToGraduationRequest.getClass();
                return g0b0Var.f(respondToGraduationRequest).d(Observable.just(new ac50(z2))).onErrorReturn(new m980((byte) 11, z2));
            case 26:
                return (CompletableSource) ((rr50) this.b).b.invoke();
        }
    }

    public void b(c8k0 c8k0Var, tv80 tv80Var) {
        if (!(c8k0Var instanceof c8k0)) {
            c8k0Var = null;
        }
        if (c8k0Var == null) {
            return;
        }
        ((iu30) ((ven0) this.b).getValue()).invoke(new msv(c8k0Var.a.b, c8k0Var.b.b, tv80Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(ww30 ww30Var, boolean z, onm onmVar) {
        fw30 fw30Var;
        String strZ;
        if (onmVar instanceof fw30) {
            fw30Var = (fw30) onmVar;
            int i = fw30Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw30Var.c = i - Integer.MIN_VALUE;
            } else {
                fw30Var = new fw30(this, onmVar);
            }
        } else {
            fw30Var = new fw30(this, onmVar);
        }
        Object objA = fw30Var.a;
        int i2 = fw30Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            int iOrdinal = ww30Var.ordinal();
            if (iOrdinal == 0) {
                upc upcVar = upc.o;
                upcVar.getClass();
                strZ = nyn1.Z(upcVar);
            } else if (iOrdinal == 1) {
                upc upcVar2 = upc.n;
                upcVar2.getClass();
                strZ = nyn1.Z(upcVar2);
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                strZ = "";
            }
            String strZ2 = upn1.z(upn1.q());
            b2e b2eVar = (b2e) this.b;
            fw30Var.c = 1;
            objA = b2eVar.a(strZ, z, strZ2, fw30Var);
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
        h290<Feed> h290VarO = ((Feeds) objA).o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (Feed feed : h290VarO) {
            feed.getClass();
            arrayList.add(nyo1.n(feed));
        }
        return new dw30(new ArrayList(nj00.a(arrayList)));
    }

    public void d(s02 s02Var) {
        x350 x350Var = (x350) this.b;
        Logger.b("[LiveSharing] Session ended with reason: " + s02Var + ".", new Object[0]);
        int iOrdinal = s02Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            x350Var.d(bsd0.a);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            x350Var.d(csd0.a);
        } else {
            eg.o();
        }
    }

    public void e(String str) {
        xxu xxuVar = (xxu) this.b;
        xxuVar.f++;
        xxuVar.c.obtainMessage(8, str).sendToTarget();
    }

    public Iterator f() {
        return ((Set) this.b).iterator();
    }

    public void g(int i, String str) {
        xxu xxuVar = (xxu) this.b;
        xxuVar.f++;
        xxuVar.c.obtainMessage(4, i, 0, str).sendToTarget();
    }

    public void v(Object obj) {
        z800 z800Var = (z800) obj;
        zpr zprVar = (zpr) this.b;
        AddToButtonView addToButtonView = (AddToButtonView) ((g2z) zprVar.f).d;
        if (!(((x800) zprVar.d) instanceof w800)) {
            addToButtonView.setVisibility(8);
            return;
        }
        boolean z = false;
        addToButtonView.setVisibility(0);
        if (((z800) zprVar.g) != null) {
            z = !(z800Var != null);
        }
        addToButtonView.a(new pk1(qk1.a, z, (String) null, (String) null, (j7p1) null, 28));
    }

    public /* synthetic */ dqu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public dqu(b2e b2eVar, zov0 zov0Var) {
        this.a = (byte) 21;
        this.b = b2eVar;
    }

    public dqu(Set set) {
        this.a = (byte) 14;
        this.b = set;
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        hxf1 hxf1Var = (hxf1) this.b;
        k4m k4mVar = hxf1Var.e;
        return new hxf1(hxf1Var.a, hxf1Var.b, hxf1Var.c, hxf1Var.d, k4mVar, bool2.booleanValue() ? 1 : 3, k4mVar == k4m.d || !bool.booleanValue(), hxf1Var.h, hxf1Var.i, hxf1Var.j, hxf1Var.k, hxf1Var.l, hxf1Var.m, hxf1Var.n, hxf1Var.o);
    }
}
