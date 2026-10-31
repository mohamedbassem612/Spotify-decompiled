package p;

import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kap1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public kap1(String str, ain1 ain1Var, gap1 gap1Var, clv clvVar, Integer num) {
        this.a = str;
        this.b = ain1Var;
        this.c = gap1Var;
        this.d = clvVar;
        this.e = num;
    }

    public static kap1 a(String str, ain1 ain1Var, gap1 gap1Var, clv clvVar, Integer num) throws GeneralSecurityException {
        clv clvVar2 = clv.h;
        if (num != null && clvVar == clvVar2) {
            k220.r("Cannot set idRequirement for OutputPrefixType RAW");
            return null;
        }
        if (num == null && clvVar != clvVar2) {
            k220.r("Cannot have null idRequirement unless OutputPrefixType is RAW");
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(str.length() + 50 + String.valueOf(i).length());
                sb.append("typeURL ");
                sb.append(str);
                sb.append(" contains non-ascii character at position ");
                sb.append(i);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return new kap1(str, ain1Var, gap1Var, clvVar, num);
    }

    public kap1(RoundedConstraintLayout roundedConstraintLayout, EditText editText, RecyclerView recyclerView, TextView textView, TextView textView2, EncoreButton encoreButton) {
        this.a = editText;
        this.b = recyclerView;
        this.c = textView;
        this.d = textView2;
        this.e = encoreButton;
    }
}
