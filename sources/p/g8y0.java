package p;

import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import com.spotify.scrollsita.v1.Section;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g8y0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8y0(ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 1:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 2:
                ((iu30) ven0Var.getValue()).invoke(stz0.a);
                return rih1Var;
            case 3:
                ((iu30) ven0Var.getValue()).invoke(ptz0.a);
                return rih1Var;
            case 4:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 5:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 6:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                return rih1Var;
            case 7:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 8:
                Offset offset = (Offset) ven0Var.getValue();
                long j = offset.a;
                return offset;
            case 9:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 10:
                Function0 function0 = (Function0) ven0Var.getValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 11:
                Function0 function1 = (Function0) ven0Var.getValue();
                if (function1 != null) {
                    function1.invoke();
                }
                return rih1Var;
            case 12:
                return Long.valueOf(((ru41) ven0Var.getValue()).a.c);
            case 13:
                return (String) ven0Var.getValue();
            case 14:
                ven0Var.setValue(uex0.a);
                return rih1Var;
            case 15:
                return (Boolean) ven0Var.getValue();
            case 16:
                float f = yy51.c;
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 17:
                float f2 = yy51.c;
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 18:
                ven0Var.setValue(ljx0.e);
                return rih1Var;
            case 19:
                return (Uri) ven0Var.getValue();
            case 20:
                return (c380) ven0Var.getValue();
            case 21:
                return (Uri) ven0Var.getValue();
            case 22:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 23:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 24:
                return Integer.valueOf(((Number) ven0Var.getValue()).intValue());
            case 25:
                return (m511) ven0Var.getValue();
            case 26:
                dca1 dca1Var = (dca1) ven0Var.getValue();
                bca1 bca1Var = dca1Var instanceof bca1 ? (bca1) dca1Var : null;
                List list = bca1Var != null ? bca1Var.a : null;
                return list == null ? z6x.a : list;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return (Integer) ((Function0) ven0Var.getValue()).invoke();
            case 28:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
        }
    }
}
