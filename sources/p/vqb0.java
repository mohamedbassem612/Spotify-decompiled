package p;

import android.view.View;
import com.spotify.metadata.proto.Metadata$Episode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vqb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public vqb0(yqb0 yqb0Var, sb11 sb11Var, p811 p811Var) {
        this.a = (byte) 0;
        this.b = yqb0Var;
        this.c = p811Var;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 10;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object obj3 = ((yqb0) obj2).b.b;
                return null;
            case 1:
                return ((Single) ((x5u) obj2).invoke()).flatMapCompletable(new ruc0((Object) this, (byte) 11));
            case 2:
                return new b8d0(((dg90) obj2).d(), this, (byte) 21);
            case 3:
                g8b0 g8b0Var = (g8b0) obj;
                z6x z6xVar = (List) ((x8o0) obj2).e.getValue();
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                List list = (Iterable) z6xVar;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gmh1) it.next()).y0(g8b0Var));
                }
                return arrayList;
            case 4:
                ((e6p0) obj2).P0 = ((l4p0) obj).a();
                return rih1Var;
            case 5:
                return ((v5n) obj2).c((String) obj).onErrorReturn(new vgq0(this, (byte) 19)).map(new rut0(this, b2));
            case 6:
                return Observable.combineLatest(Observable.defer(new yj1((p8o) obj2, (byte) 15)), (ObservableSource) ((x5u) obj).invoke(), u3x0.Y).doOnError(w841.T0).onErrorReturn(a4x0.X).distinctUntilChanged();
            case 7:
                View view = (View) obj;
                View viewFindViewById = view.findViewById(2131427855);
                if (viewFindViewById != null) {
                    ((l8s) obj2).c(new ijo0(new mx81(view.getResources().getString(2131964052), 2, 0, 5000L, Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER), viewFindViewById, null, 12));
                }
                return rih1Var;
            default:
                byp bypVar = (byp) ((mxa1) obj2).b;
                return ((kf5) ((ks6) bypVar.b).e).o((rgy0) obj, (zjn0) bypVar.c);
        }
    }

    public /* synthetic */ vqb0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
