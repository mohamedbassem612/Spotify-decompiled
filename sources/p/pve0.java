package p;

import com.spotify.address.endpoint.model.v1.proto.FormField;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pve0 {
    public static jve0 a(FormField formField, String str) {
        Object next;
        Iterator it = formField.t().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FormField.ValidationRule validationRule = (FormField.ValidationRule) next;
            int iQ = validationRule.q();
            int i = iQ == 0 ? -1 : lve0.c[l1d.C(iQ)];
            if (i != -1) {
                if (i != 1) {
                    if (i == 2) {
                        if (!Pattern.matches(validationRule.p().o(), str == null ? "" : str)) {
                            break;
                        }
                    } else if (i != 3) {
                        eg.o();
                        return null;
                    }
                } else if (str == null || ihc1.y0(str)) {
                    break;
                }
            }
        }
        FormField.ValidationRule validationRule2 = (FormField.ValidationRule) next;
        if (validationRule2 != null) {
            return new jve0(validationRule2.o(), validationRule2.n());
        }
        return null;
    }

    public static Next b(yxz yxzVar) {
        Integer num;
        return Next.i(hgm0.a, Collections.singleton(new acw((yxzVar == null || (num = yxzVar.a) == null || num.intValue() != 401) ? q12.b : r12.b)));
    }
}
