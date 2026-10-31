package p;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z6v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6v0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                return f6o1.A(((y441) this.b).j(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 1:
                return f6o1.A(((a7v0) this.b).c.j(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 2:
                k9v0 k9v0Var = (k9v0) this.b;
                MobiusLoop mobiusLoop = k9v0Var.b;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                mmr0 mmr0VarR = bin.r(mobiusLoop);
                Disposable disposable = (Disposable) mmr0VarR.a;
                wen0 wen0Var = (wen0) mmr0VarR.b;
                k9v0Var.c = disposable;
                return wen0Var;
            case 3:
                s9v0 s9v0Var = (s9v0) this.b;
                luk lukVar = s9v0Var.b;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(s9v0Var, (byte) 8));
                }
                return null;
            case 4:
                w9v0 w9v0Var = (w9v0) this.b;
                luk lukVar2 = w9v0Var.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new e4n0(w9v0Var, (byte) 9));
                }
                return null;
            case 5:
                ce3 ce3Var = (ce3) this.b;
                return q1o1.u(new jpg0(ce3Var.c.a(), new n5u0(ce3Var, (byte) 22)), u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 6:
                qgv0 qgv0Var = (qgv0) this.b;
                yqu0 yqu0Var = qgv0Var.c;
                i8h1 i8h1Var = (i8h1) ((kly0) yqu0Var.c).get();
                x6h1 x6h1VarC = ((brl0) yqu0Var.b).b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                qgv0Var.a.a(ixb.c);
                return rih1.a;
            case 7:
                return ((yfx) this.b).a((l0i) null);
            case 8:
                MobiusLoop mobiusLoop2 = ((flv0) this.b).b;
                if (mobiusLoop2 != null) {
                    return aym.l(mobiusLoop2);
                }
                u890.C("loop");
                throw null;
            case 9:
                MobiusLoop mobiusLoop3 = ((glv0) this.b).b;
                if (mobiusLoop3 == null) {
                    u890.C("loop");
                    throw null;
                }
                Object obj = mobiusLoop3.i;
                obj.getClass();
                bpb1 bpb1VarB = gio1.b(obj);
                mobiusLoop3.b(new qlo(bpb1VarB, (byte) 3));
                return bpb1VarB;
            case 10:
                onv0 onv0Var = (onv0) this.b;
                return onv0Var.a.c(onv0Var.b);
            case 11:
                isv0 isv0Var = (isv0) this.b;
                luk lukVar3 = isv0Var.e;
                if (lukVar3 != null) {
                    return lukVar3.e(new e4n0(isv0Var, (byte) 10));
                }
                return null;
            case 12:
                bqv0 bqv0Var = (bqv0) this.b;
                if (bqv0Var.a.a()) {
                    io.reactivex.rxjava3.disposables.Disposable disposable2 = bqv0Var.f;
                    if (disposable2 != null && !disposable2.isDisposed()) {
                        io.reactivex.rxjava3.disposables.Disposable disposable3 = bqv0Var.f;
                        if (disposable3 == null) {
                            u890.C("fetchCampaignDisposable");
                            throw null;
                        }
                        disposable3.dispose();
                    }
                    io.reactivex.rxjava3.disposables.Disposable disposable4 = bqv0Var.g;
                    if (disposable4 != null && !disposable4.isDisposed()) {
                        io.reactivex.rxjava3.disposables.Disposable disposable5 = bqv0Var.g;
                        if (disposable5 == null) {
                            u890.C("sharedPrefDisposable");
                            throw null;
                        }
                        disposable5.dispose();
                    }
                    bqv0Var.h = null;
                }
                return rih1.a;
            case 13:
                return ((qzh) ((y9n) this.b).b.getValue()).getView();
            case 14:
                return b8k1.n((ViewGroup) ((idd1) ((dzp0) this.b).b).getValue(), 2131430477);
            case 15:
                h8w0 h8w0Var = (h8w0) this.b;
                q7r0 q7r0Var = h8w0Var.d.a;
                yqu0 yqu0Var2 = h8w0Var.e;
                i8h1 i8h1Var2 = (i8h1) ((kly0) yqu0Var2.c).get();
                x6h1 x6h1VarC2 = ((h7l0) yqu0Var2.b).b.c();
                x6h1VarC2.i.add(new a7h1("write_prompt_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                lik1 lik1Var = nik1.q6;
                String str2 = lik1Var.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str2 == null) {
                    str2 = "";
                }
                tv80 tv80VarM = i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                String str3 = lik1Var.a;
                q7r0Var.c("");
                q7r0Var.d(str3, tv80VarM, (Bundle) null);
                return rih1.a;
            case 16:
                return (sbw0) this.b;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (fpw0) ((wpw0) this.b).b.get();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                lww0 lww0Var = (lww0) this.b;
                return Float.valueOf(lww0Var.a() != 0.0f ? yoi1.o((-lww0Var.c.s()) / lww0Var.a(), 0.0f, 1.0f) : 0.0f);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((Observable) ((lzw0) this.b).a.o.getValue()).startWithItem(new xb41()).buffer(2, 1).map(xj20.e1);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(((i8x0) this.b).Q0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                k2q k2qVar = (k2q) ((zlx0) this.b).b.a.b;
                kx21 kx21Var = (kx21) ((zzp) k2qVar.b).a.a.Nb.get();
                c8o.l(kx21Var);
                amx0 amx0Var = (amx0) ((zzp) k2qVar.b).a.a.Qb.get();
                c8o.l(amx0Var);
                return new kpg0(new ngs0(kx21Var, amx0Var), ilx0.g);
            case 22:
                return ((anx0) this.b).d.e();
            case 23:
                return new tgm((String) null, false, false, false, false, false, false, jon1.I((he81) this.b), true, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -769, 1);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                umx0 umx0Var = (umx0) this.b;
                return new tgm((String) null, true, false, false, false, false, false, oon1.E(umx0Var), false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, umx0Var.v, false, false, -536871179, 1);
            case 25:
                mox0 mox0Var = (mox0) this.b;
                m87 m87Var = mox0Var.c;
                if (m87Var instanceof wxe1) {
                    str = ((wxe1) m87Var).e;
                } else {
                    if (!(m87Var instanceof xxe1)) {
                        eg.o();
                        return null;
                    }
                    str = ((xxe1) m87Var).d;
                }
                String str4 = mox0Var.g;
                String str5 = mox0Var.j;
                if (str5 == null) {
                    str5 = mox0Var.f;
                }
                return new tgm((String) null, true, false, false, false, false, false, new yh10(str, str4, null, new ugo0(false, str5, mox0Var.a, false, false, null, null, 493), 20), false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -267, 1);
            case 26:
                return ycm.a(((iox0) this.b).a);
            case 27:
                tzr0 tzr0Var = (tzr0) this.b;
                return Boolean.valueOf(u890.j(((lmo) tzr0Var.c).a, "default") && ((w25) tzr0Var.d).s() && ((bp60) ((yo2) ((ynb0) tzr0Var.b).get()).b0.getValue()) != null);
            case 28:
                PromptSuggestionsProvider promptSuggestionsProvider = (PromptSuggestionsProvider) this.b;
                ynb0 ynb0Var = promptSuggestionsProvider.c;
                lnm lnmVar = null;
                if (ynb0Var == null) {
                    u890.C("gate");
                    throw null;
                }
                qyx0 qyx0Var = (qyx0) ynb0Var.get();
                fn31.T(promptSuggestionsProvider.e, (o8n) null, 0, new pew0(qyx0Var, promptSuggestionsProvider, false, lnmVar, (byte) 19), 3);
                return qyx0Var;
            default:
                return ((lwp) ((pt) this.b).h).a(nik1.z0, false, Mode.PROMPTABLE_SECTION);
        }
    }
}
