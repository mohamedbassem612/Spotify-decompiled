package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconCheck;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v8w0 {
    public final ConstraintLayout a;
    public final IconCheck b;
    public final EncoreTitleView c;

    public v8w0(ConstraintLayout constraintLayout, IconCheck iconCheck, EncoreTitleView encoreTitleView) {
        this.a = constraintLayout;
        this.b = iconCheck;
        this.c = encoreTitleView;
    }

    public static v8w0 b(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625450, (ViewGroup) null, false);
        int i = 2131429279;
        IconCheck iconCheck = (IconCheck) m5n1.t(constraintLayoutInflate, 2131429279);
        if (iconCheck != null) {
            i = 2131431356;
            EncoreTitleView encoreTitleViewT = m5n1.t(constraintLayoutInflate, 2131431356);
            if (encoreTitleViewT != null) {
                return new v8w0(constraintLayoutInflate, iconCheck, encoreTitleViewT);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final ConstraintLayout a() {
        return this.a;
    }
}
