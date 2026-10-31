package p;

import android.view.View;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n8r implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n8r(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((o8r) obj2).getClass();
                return true;
            case 1:
                evs evsVar = (evs) obj2;
                if (evsVar.d || !((ActionBarComplexRowSearchView) evsVar.e.e).y()) {
                    return false;
                }
                ((iu30) obj).invoke(vlf1.b);
                return true;
            default:
                ((iu30) obj2).invoke(new fjy(((lly) obj).e));
                return true;
        }
    }
}
