package p;

import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class rm80 extends tv30 implements vu30 {
    public static final rm80 a = new rm80(2, tm80.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/campfire/chatpage/ui/tabs/insights/InsightsTabElement$Props;Lcom/spotify/campfire/chatpage/ui/tabs/insights/InsightsTabModel;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        qm80 qm80Var = (qm80) obj;
        bn80 bn80Var = (bn80) obj2;
        String str = qm80Var.c;
        ArrayList arrayList = qm80Var.b;
        String str2 = qm80Var.a;
        if (u890.j(str2, bn80Var.a)) {
            return (arrayList.equals(bn80Var.b) && u890.j(str, bn80Var.c)) ? Next.j() : Next.h(bn80.a(bn80Var, null, arrayList, str, null, false, false, null, n8p1.t(str, bn80Var.d, arrayList), 121));
        }
        z6x z6xVar = z6x.a;
        return Next.i(new bn80(str2, arrayList, str, z6xVar, true, false, w7x.a, z6xVar), Collections.singleton(new jm80(str2)));
    }
}
