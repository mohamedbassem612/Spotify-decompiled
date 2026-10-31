package p;

import com.ravelin.core.model.EventData;
import com.ravelin.core.model.EventMeta;
import com.ravelin.core.model.Fingerprint;
import com.ravelin.core.model.Payload;
import com.ravelin.core.model.RavelinError;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rug {
    public static final String b;
    public final s7n1 a;

    static {
        String canonicalName = rug.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = rug.class.getSimpleName();
        }
        b = canonicalName;
    }

    public rug(s7n1 s7n1Var) {
        this.a = s7n1Var;
    }

    public final Payload a(String str, String str2, ivz0 ivz0Var) {
        try {
            Payload payload = new Payload("7.0.0-ravelinandroid", str, str2, "android", b(), (String) null, (String) null, (Fingerprint) null, (String) null, (String) null, (String) null, (EventData) null, (EventMeta) null, 8064, (DefaultConstructorMarker) null);
            String str3 = b;
            utw0 utw0Var = ike1.a;
            utw0Var.y(str3);
            utw0Var.o("Created payload = " + payload, new Object[0]);
            return payload;
        } catch (Exception e) {
            ivz0Var.n(new RavelinError(e.getMessage(), (String) null, 2, (DefaultConstructorMarker) null));
            return new Payload("7.0.0-ravelinandroid", str, str2, "android", "", (String) null, (String) null, (Fingerprint) null, (String) null, (String) null, (String) null, (EventData) null, (EventMeta) null, 8064, (DefaultConstructorMarker) null);
        }
    }

    public final String b() {
        byte[] bArrA = ((y6n1) this.a.a).a(10);
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArrA) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        String upperCase = stringBuffer.toString().toUpperCase(Locale.ROOT);
        String str = s7n1.b;
        String strConcat = "Session Id = ".concat(upperCase);
        utw0 utw0Var = ike1.a;
        utw0Var.y(str);
        utw0Var.o(strConcat, new Object[0]);
        return upperCase;
    }
}
