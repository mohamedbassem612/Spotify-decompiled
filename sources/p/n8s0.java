package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textview.MaterialTextView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.legacyglue.icons.SpotifyIconView;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class n8s0 {
    public final Class a;

    /* JADX INFO: Fake field, exist only in values array */
    n8s0 EF7;
    public static final /* synthetic */ n8s0[] c = {new e8s0(0, AutoCompleteTextView.class, "AUTOCOMPLETETEXTVIEW"), new f8s0(1, Button.class, "BUTTON"), new g8s0(2, ImageView.class, "IMAGEVIEW"), new h8s0(3, ImageButton.class, "IMAGEBUTTON"), new i8s0(4, ToggleButton.class, "TOGGLEBUTTON"), new j8s0(5, CheckBox.class, "CHECKBOX"), new k8s0(6, CheckedTextView.class, "CHECKEDTEXTVIEW"), new l8s0(7, EditText.class, "EDITTEXT"), new m8s0(8, RadioButton.class, "RADIOBUTTON"), new u7s0(9, TextView.class, "TEXTVIEW"), new v7s0(10, AppCompatTextView.class, "APPCOMPAT_TEXTVIEW"), new w7s0(11, MaterialTextView.class, "MATERIAL_TEXTVIEW"), new x7s0(12, SwitchCompat.class, "SWITCHCOMPAT_VIEW"), new y7s0(13, SpotifyIconView.class, "SPOTIFY_ICON_VIEW"), new z7s0(14, LinearLayout.class, "LINEAR_LAYOUT"), new a8s0(15, FrameLayout.class, "FRAME_LAYOUT"), new b8s0(16, RelativeLayout.class, "RELATIVE_LAYOUT"), new c8s0(17, ConstraintLayout.class, "CONSTRAINT_LAYOUT"), new d8s0(18, CoordinatorLayout.class, "COORDINATOR_LAYOUT")};
    public static final n8s0[] b = values();

    public n8s0(int i, Class cls, String str) {
        super(str, i);
        this.a = cls;
    }

    public static n8s0 valueOf(String str) {
        return (n8s0) Enum.valueOf(n8s0.class, str);
    }

    public static n8s0[] values() {
        return (n8s0[]) c.clone();
    }

    public View a(Context context, AttributeSet attributeSet, int i) {
        return new EncoreTextView(context, attributeSet, i);
    }

    public int b() {
        return 0;
    }
}
