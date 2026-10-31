package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class s5 {
    public void b(sla1 sla1Var) {
        f().a(sla1Var);
    }

    public boolean c(e6b e6bVar) {
        return this instanceof v6b;
    }

    public boolean d() {
        return this instanceof zor0;
    }

    public abstract e6b f();

    public List g() {
        return Collections.EMPTY_LIST;
    }

    public boolean h() {
        return this instanceof v6b;
    }

    public jwg j(cqu cquVar) {
        char cCharAt;
        int i = cquVar.f;
        CharSequence charSequence = cquVar.a.a;
        if (cquVar.h >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i2 = cquVar.d + cquVar.h;
        int i3 = i2 + 1;
        CharSequence charSequence2 = cquVar.a.a;
        int i4 = i + 1;
        if (i4 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new jwg(-1, i3, false);
    }

    public void e() {
    }

    public void a(ala1 ala1Var) {
    }

    public void i(ug80 ug80Var) {
    }
}
