package p;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayList;
import java.util.Locale;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e5v0 implements Html.TagHandler {
    public final ArrayList a = new ArrayList();

    public final void a(boolean z, boolean z2, Editable editable) {
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(new d5v0(z2));
            return;
        }
        r7h.e0(arrayList);
        if (arrayList.isEmpty()) {
            editable.append('\n');
        }
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (editable == null || str == null) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 1611508057) {
            if (iHashCode == 1611508153) {
                if (lowerCase.equals("custom-ol")) {
                    a(z, true, editable);
                    return;
                }
                return;
            } else {
                if (iHashCode == 1611508339 && lowerCase.equals("custom-ul")) {
                    a(z, false, editable);
                    return;
                }
                return;
            }
        }
        if (lowerCase.equals("custom-li") && z) {
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                return;
            }
            if (editable.length() > 0 && ihc1.z0(editable) != '\n') {
                editable.append('\n');
            }
            int size = arrayList.size() - 1;
            for (int i = 0; i < size; i++) {
                editable.append('\t');
            }
            d5v0 d5v0Var = (d5v0) o7h.A0(arrayList);
            if (!d5v0Var.a) {
                editable.append("• ");
                return;
            }
            int i2 = d5v0Var.b + 1;
            d5v0Var.b = i2;
            editable.append((CharSequence) (i2 + ". "));
        }
    }
}
