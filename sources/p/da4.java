package p;

import android.content.res.Resources;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class da4 extends tv30 implements xu30 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pze0.m(obj);
        ha4 ha4Var = (ha4) ((lyc) this).receiver;
        Resources resources = ha4Var.getContext().getResources();
        return Boolean.valueOf(sa4.a.a(ha4Var, (f4v) null, new duj(new xat(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((Size) obj2).a, (iu30) obj3)));
    }
}
