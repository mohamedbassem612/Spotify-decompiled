package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u51(v51 v51Var, byte b) {
        super(0);
        this.a = b;
        this.b = v51Var;
    }

    public final Object invoke() {
        String str;
        byte b = this.a;
        l711 l711Var = l711.a;
        scd1 scd1Var = scd1.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        v51 v51Var = this.b;
        switch (b) {
            case 0:
                v51Var.a(l51.c);
                PublishSubject publishSubject = v51Var.Q0;
                publishSubject.onNext(wfg.a);
                publishSubject.onNext(scd1Var);
                break;
            case 1:
                v51Var.Z.onNext(y41.a);
                break;
            case 2:
                i8h1 i8h1Var = v51Var.f;
                x6h1 x6h1VarC = v51Var.h.a.c();
                x6h1VarC.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                w6b1 w6b1VarA = f7b1.a(blc0.va);
                str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var = v51Var.g;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(qhe0Var, yon1.v());
                v51Var.Q0.onNext(l711Var);
                break;
            case 3:
                i8h1 i8h1Var2 = v51Var.f;
                x6h1 x6h1VarC2 = v51Var.h.a.c();
                x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var2 = v51Var.g;
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                t8h1.n(qhe0Var2, yon1.v());
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            case 4:
                v51Var.g.F();
                break;
            case 5:
                v51Var.g.F();
                break;
            case 6:
                i8h1 i8h1Var3 = v51Var.f;
                x6h1 x6h1VarC3 = v51Var.h.a.c();
                x6h1VarC3.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                w6b1 w6b1VarA2 = f7b1.a(blc0.va);
                str = w6b1VarA2 != null ? (String) o7h.s0(w6b1VarA2.c) : null;
                i8h1Var3.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var3 = v51Var.g;
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                t8h1.n(qhe0Var3, yon1.v());
                v51Var.Q0.onNext(l711Var);
                break;
            case 7:
                i8h1 i8h1Var4 = v51Var.f;
                x6h1 x6h1VarC4 = v51Var.h.a.c();
                x6h1VarC4.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var4.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var4 = v51Var.g;
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                t8h1.n(qhe0Var4, yon1.v());
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            case 8:
                v51Var.g.F();
                break;
            case 9:
                i8h1 i8h1Var5 = v51Var.f;
                x6h1 x6h1VarC5 = v51Var.t.a.c();
                x6h1VarC5.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var5.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var5 = v51Var.g;
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                t8h1.n(qhe0Var5, yon1.v());
                v51Var.Q0.onNext(new kn00(false, pn00.b));
                break;
            case 10:
                v51Var.g.F();
                break;
            case 11:
                i8h1 i8h1Var6 = v51Var.f;
                x6h1 x6h1VarC6 = v51Var.X.a.c();
                x6h1VarC6.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var6.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var6 = v51Var.g;
                AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                t8h1.n(qhe0Var6, yon1.v());
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            case 12:
                v51Var.g.F();
                break;
            case 13:
                v51Var.Q0.onNext(l461.a);
                break;
            case 14:
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            case 15:
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            case 16:
                v51Var.g.F();
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                v51Var.g.F();
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                i8h1 i8h1Var7 = v51Var.f;
                x6h1 x6h1VarC7 = v51Var.i.a.c();
                x6h1VarC7.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                i8h1Var7.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var7 = v51Var.g;
                AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                t8h1.n(qhe0Var7, yon1.v());
                v51Var.Q0.onNext(scd1Var);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                i8h1 i8h1Var8 = v51Var.f;
                x6h1 x6h1VarC8 = v51Var.i.a.c();
                x6h1VarC8.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                i8h1Var8.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var8 = v51Var.g;
                AtomicReferenceArray atomicReferenceArray8 = p6r0.e;
                t8h1.n(qhe0Var8, yon1.v());
                v51Var.Q0.onNext(new kn00(false, (tn00) null));
                break;
            default:
                v51Var.g.F();
                break;
        }
        return rih1Var;
    }
}
