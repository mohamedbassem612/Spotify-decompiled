package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k230 implements acr0 {
    @Override // p.acr0
    public final Class b() {
        return p130.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String str = th61Var.a;
        Set set = s4b1.f;
        String strK = zjy.k(intent);
        if (strK == null) {
            strK = "";
        }
        return new j230(strK, s4b1Var.c, str, intent.getStringExtra("filter"), intent.getStringExtra("parent_folder_uri"));
    }

    @Override // p.acr0
    public final Set e() {
        return Collections.singleton(bzu0.f);
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Your Library Playlist Folder Page";
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        return true;
    }
}
