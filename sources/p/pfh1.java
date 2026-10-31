package p;

import android.net.Uri;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pfh1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ rfh1 b;
    public final /* synthetic */ aap0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfh1(rfh1 rfh1Var, aap0 aap0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.b = rfh1Var;
        this.c = aap0Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new pfh1(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            m111 m111Var = this.b.a;
            this.a = true;
            obj = m111Var.a(this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        List<u011> list = ((l111) obj).a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (u011 u011Var : list) {
            arrayList.add(u011.a(u011Var, hno1.q(Uri.parse(u011Var.c), u011Var.e).toString(), (String) null, 27));
        }
        return new WidgetState.Unauthenticated(arrayList, this.c.a(), this.d, false, 8, null);
    }
}
