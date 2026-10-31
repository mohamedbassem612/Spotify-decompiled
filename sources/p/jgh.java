package p;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.facepile.FaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jgh {
    public final ConstraintLayout a;
    public final Group b;
    public final TextView c;
    public final EditText d;
    public final EditText e;
    public final TextView f;
    public final FaceView g;
    public final EncoreButton h;
    public final ImageView i;

    public jgh(ConstraintLayout constraintLayout, Group group, TextView textView, EditText editText, EditText editText2, TextView textView2, FaceView faceView, EncoreButton encoreButton, ImageView imageView) {
        this.a = constraintLayout;
        this.b = group;
        this.c = textView;
        this.d = editText;
        this.e = editText2;
        this.f = textView2;
        this.g = faceView;
        this.h = encoreButton;
        this.i = imageView;
    }

    public static jgh a(View view) {
        int i = 2131427498;
        Group groupT = m5n1.t(view, 2131427498);
        if (groupT != null) {
            i = 2131427959;
            TextView textView = (TextView) m5n1.t(view, 2131427959);
            if (textView != null) {
                i = 2131428132;
                EditText editText = (EditText) m5n1.t(view, 2131428132);
                if (editText != null) {
                    i = 2131428897;
                    EditText editText2 = (EditText) m5n1.t(view, 2131428897);
                    if (editText2 != null) {
                        i = 2131430398;
                        TextView textView2 = (TextView) m5n1.t(view, 2131430398);
                        if (textView2 != null) {
                            i = 2131430523;
                            FaceView faceViewT = m5n1.t(view, 2131430523);
                            if (faceViewT != null) {
                                i = 2131430922;
                                EncoreButton encoreButtonT = m5n1.t(view, 2131430922);
                                if (encoreButtonT != null) {
                                    i = 2131430923;
                                    if (((Space) m5n1.t(view, 2131430923)) != null) {
                                        i = 2131431348;
                                        ImageView imageView = (ImageView) m5n1.t(view, 2131431348);
                                        if (imageView != null) {
                                            return new jgh((ConstraintLayout) view, groupT, textView, editText, editText2, textView2, faceViewT, encoreButtonT, imageView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
