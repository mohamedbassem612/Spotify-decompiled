package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.scrollsita.v1.Section;
import com.spotify.wrapped.v1.proto.Paragraph;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l451 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l451(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        rxe1 rxe1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Integer numValueOf = null;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((m451) ((wo5) obj).b).a.d();
                return rih1Var;
            case 1:
                return ((t451) obj).a;
            case 2:
                y6r0 y6r0Var = ((b7r0) obj).get();
                if (y6r0Var != null) {
                    return y6r0Var.a;
                }
                return null;
            case 3:
                lw41 lw41Var = ((od51) obj).a;
                return Boolean.valueOf((lw41Var instanceof lw41) && !(lw41Var instanceof kw41));
            case 4:
                return (d8r0) obj;
            case 5:
                xok0 xok0Var = ((db51) obj).U0;
                xok0Var.getClass();
                x6h1 x6h1VarC = xok0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 6:
                e7r0 e7r0Var = (e7r0) obj;
                return new d8r0(e7r0Var.a, e7r0Var.b.c, e7r0Var.c, e7r0Var.e);
            case 7:
                return new SchedulerWorkRunner((Scheduler) ((qhm) obj).d);
            case 8:
                return flo1.l(((lu51) obj).b, guo1.B());
            case 9:
                return flo1.l(((zu51) obj).d, guo1.B());
            case 10:
                jz51 jz51Var = (jz51) obj;
                a1r0 a1r0Var = jz51Var.b;
                if (a1r0Var.h(jz51Var.c)) {
                    a1r0Var.l();
                } else {
                    jz51Var.a.e();
                }
                return rih1Var;
            case 11:
                e061 e061Var = (e061) obj;
                View view = e061Var.a;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(2131430918);
                tka0 tka0Var = dtw.C;
                Context context = view.getContext();
                frameLayout.getClass();
                dtw dtwVarD = mhc.d(context, frameLayout, e061Var.b, (drw) null, 24);
                k8p1.o(frameLayout, dtwVarD.w);
                return dtwVarD;
            case 12:
                i161 i161Var = (i161) obj;
                vdq vdqVar = i161Var.d;
                String str = i161Var.a;
                Function0 function0 = i161Var.c;
                teq teqVar = vdqVar.a.d;
                return new nxz0(str, false, function0, teqVar.c3(), new uqv0((iyc0) teqVar.g1.get(), (byte) 14), (t001) teqVar.a2.get());
            case 13:
                return Paragraph.w(((d761) obj).a);
            case 14:
                ((h961) obj).b.invoke();
                return rih1Var;
            case 15:
                ywv0 ywv0Var = (ywv0) obj;
                return ((Flowable) ywv0Var.b).X(new bb01(ywv0Var, (byte) 22));
            case 16:
                dc61 dc61Var = (dc61) obj;
                ymc0 ymc0Var = (ymc0) dc61Var.X.getValue();
                lzn0 lzn0Var = dc61Var.t;
                String str2 = dc61Var.c;
                if (ymc0Var != null && (rxe1Var = ymc0Var.b) != null) {
                    numValueOf = Integer.valueOf(rxe1Var.b);
                }
                loo1.y(lzn0Var, str2, numValueOf);
                return rih1Var;
            case 17:
                return new kpg0((dc61) ((w4y0) obj).e, ec61.c);
            case 18:
                return new kpg0((xpw) ((ncc0) obj).h.get(), ec61.X);
            case 19:
                return new kpg0((xpw) ((j2y0) obj).f.get(), ec61.U0);
            case 20:
                tqw tqwVar = (tqw) obj;
                tqwVar.getClass();
                return n3o1.y(tqwVar);
            case 21:
                return (jn61) ((kly0) ((y441) obj).a).get();
            case 22:
                ((iu30) ((b14) obj).b).invoke(ap61.a);
                return rih1Var;
            case 23:
                return new kpg0((xpw) ((bpq) ((zwr) obj).f).get(), ec61.e1);
            case 24:
                return ((yr61) ((qr61) obj).b.c().get()).create();
            case 25:
                Set set = ((ss61) obj).a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : set) {
                    p6r0 p6r0VarE = ((rs61) obj2).e();
                    Object arrayList = linkedHashMap.get(p6r0VarE);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(p6r0VarE, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                return linkedHashMap;
            case 26:
                return ((iu61) ((ju61) obj).b.c().get()).create();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                Set set2 = ((nu61) obj).a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : set2) {
                    p6r0 p6r0VarE2 = ((mu61) obj3).e();
                    Object arrayList2 = linkedHashMap2.get(p6r0VarE2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(p6r0VarE2, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                return linkedHashMap2;
            case 28:
                su61 su61Var = (su61) obj;
                i8h1 i8h1Var = su61Var.b;
                x6h1 x6h1VarC3 = su61Var.e.b.c();
                x6h1VarC3.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                su61Var.a.e();
                return rih1Var;
            default:
                return (tfo0) obj;
        }
    }
}
