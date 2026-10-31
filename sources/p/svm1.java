package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class svm1 implements acr0 {
    public final /* synthetic */ byte a;

    @Override // p.acr0
    public final Set a() {
        switch (this.a) {
            case 0:
                return w7x.a;
            default:
                return Collections.singleton(blc0.COLLECTION_SEARCH);
        }
    }

    @Override // p.acr0
    public final Class b() {
        switch (this.a) {
            case 0:
                return jvm1.class;
            default:
                return wvm1.class;
        }
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                String str = th61Var.a;
                Set set = s4b1.f;
                String strK = zjy.k(intent);
                return new rvm1(strK != null ? strK : "", s4b1Var.c, str, intent.getStringExtra("filter"));
            default:
                String str2 = th61Var.a;
                Set set2 = s4b1.f;
                String strK2 = zjy.k(intent);
                return new lwm1(str2, strK2 != null ? strK2 : "");
        }
    }

    @Override // p.acr0
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Your Library Page";
            default:
                return "Your Library Search Page";
        }
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        switch (this.a) {
        }
        return true;
    }
}
