package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e9i1 {
    public final by10 a;
    public final String b;
    public final String c;
    public final List d;

    public e9i1(by10 by10Var, String str, String str2, List list) {
        this.a = by10Var;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public static e9i1 b(e9i1 e9i1Var, by10 by10Var, String str, String str2, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            by10Var = e9i1Var.a;
        }
        if ((i & 2) != 0) {
            str = e9i1Var.b;
        }
        if ((i & 4) != 0) {
            str2 = e9i1Var.c;
        }
        List list = arrayList;
        if ((i & 8) != 0) {
            list = e9i1Var.d;
        }
        e9i1Var.getClass();
        return new e9i1(by10Var, str, str2, list);
    }

    public final String a(String str, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        String str2 = this.b;
        if (!ihc1.y0(str2)) {
            sb.append(z2 ? "*What happened:*" : "What happened:");
            sb.append('\n');
            sb.append(str2);
            sb.append('\n');
        }
        String string = this.c;
        if (str != null) {
            int iW0 = ihc1.w0(string, "*Reporter Contact:*", 0, false, 6);
            if (iW0 < 0) {
                StringBuilder sb2 = new StringBuilder();
                if (!ihc1.y0(string)) {
                    sb2.append(string);
                    sb2.append("\n\n");
                }
                sb2.append("*Reporter Contact:*\n");
                sb2.append("Email: ".concat(str));
                sb2.append('\n');
                sb2.append("Slack: @".concat(ihc1.Y0(str, '@')));
                string = sb2.toString();
            } else {
                int iW1 = ihc1.w0(string, "\n\n----", iW0 + 19, false, 4);
                Integer numValueOf = Integer.valueOf(iW1);
                if (iW1 < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : string.length();
                string = ihc1.M0(string, iIntValue, iIntValue, gvg.h("\nEmail: ", str, "\nSlack: @", ihc1.Y0(str, '@'))).toString();
            }
        }
        if (!ihc1.y0(string)) {
            sb.append('\n');
            sb.append(string);
            sb.append('\n');
        }
        if (z3 && !z) {
            sb.append("\n**User has opted out of including logs and diagnostics**\n");
        }
        return ihc1.e1(sb.toString()).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9i1)) {
            return false;
        }
        e9i1 e9i1Var = (e9i1) obj;
        return this.a == e9i1Var.a && this.b.equals(e9i1Var.b) && this.c.equals(e9i1Var.c) && u890.j(this.d, e9i1Var.d);
    }

    public final int hashCode() {
        by10 by10Var = this.a;
        return this.d.hashCode() + cy30.d(cy30.d((by10Var == null ? 0 : by10Var.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
