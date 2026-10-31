package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class ood1 extends tv30 implements iu30 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ iac0 e;
    public final /* synthetic */ vu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ood1(ArrayList arrayList, twa twaVar, Context context, iu30 iu30Var, ArrayList arrayList2, iac0 iac0Var, vu30 vu30Var) {
        super(1, t890.class, "createListElement", "registerTabElement$createListElement(Ljava/util/List;Lcom/spotify/creativeworkplatform/tabselement/TabListItemDecorationFactory;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;I)Lcom/spotify/creativeworkplatform/listelement/ListElement;", 0);
        this.a = arrayList;
        this.b = context;
        this.c = iu30Var;
        this.d = arrayList2;
        this.e = iac0Var;
        this.f = vu30Var;
    }

    public final Object invoke(Object obj) {
        iac0 iac0Var;
        int iIntValue = ((Number) obj).intValue();
        ito itoVar = (ito) this.a.get(iIntValue);
        qwc1 qwc1Var = new qwc1(itoVar, (byte) 8);
        cmd1 cmd1Var = new cmd1(this.f, itoVar, (byte) 3);
        snc0 snc0Var = itoVar.c;
        ic9 ic9Var = itoVar.g;
        zob1 zob1VarB = snc0Var.b();
        LinkedHashMap linkedHashMap = itoVar.d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iac0Var = this.e;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap2.put(entry.getKey(), (laa) ((iu30) entry.getValue()).invoke(iac0Var));
        }
        Map map = itoVar.e;
        boolean z = itoVar.h;
        Function0 function0 = itoVar.k;
        xnd1 xnd1Var = new xnd1(new um90(((ij81) ic9Var.c).b));
        Context context = this.b;
        Drawable drawableJ = f0o1.j(context, 2131233963);
        return new w2s(qwc1Var, cmd1Var, zob1VarB, linkedHashMap2, map, f46.i0(new f611[]{xnd1Var, z ? drawableJ != null ? new imu(drawableJ) : null : null, new fmd(context, function0)}), new ij81(((ij81) ic9Var.b).b, (byte) 19), w6d1.q((ymd0) this.c.invoke(itoVar), pod1.b), (tl7) this.d.get(iIntValue), iac0Var);
    }
}
