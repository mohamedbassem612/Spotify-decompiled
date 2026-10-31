package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class se11 implements Serializable {
    public final Pattern a;

    static {
        new nbc((byte) 22);
    }

    public se11(String str, int i) {
        this(Pattern.compile(str, nbc.c(ywx0.b(i))));
    }

    public static mbh0 a(se11 se11Var, CharSequence charSequence) {
        return mno1.m(se11Var.a.matcher(charSequence), 0, charSequence);
    }

    public static oh40 b(se11 se11Var, CharSequence charSequence) {
        se11Var.getClass();
        if (charSequence.length() >= 0) {
            qga0 qga0Var = new qga0(se11Var, charSequence, (byte) 11);
            re11 re11Var = re11.a;
            return z561.a0(qga0Var);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + charSequence.length());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        return new qe11(pattern.pattern(), pattern.flags());
    }

    public final mbh0 c(int i, String str) {
        Matcher matcherRegion = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new mbh0(matcherRegion, str);
        }
        return null;
    }

    public final mbh0 d(CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        if (matcher.matches()) {
            return new mbh0(matcher, charSequence);
        }
        return null;
    }

    public final boolean e(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String f(CharSequence charSequence, iu30 iu30Var) {
        int i = 0;
        mbh0 mbh0VarM = mno1.m(this.a.matcher(charSequence), 0, charSequence);
        if (mbh0VarM == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, mbh0VarM.b().a);
            sb.append((CharSequence) iu30Var.invoke(mbh0VarM));
            i = mbh0VarM.b().b + 1;
            mbh0VarM = mbh0VarM.c();
            if (i >= length) {
                break;
            }
        } while (mbh0VarM != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String g(String str, CharSequence charSequence) {
        return this.a.matcher(charSequence).replaceAll(str);
    }

    public final List h(CharSequence charSequence) {
        int iEnd = 0;
        ihc1.N0(0);
        Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return k4p1.x(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        return this.a.toString();
    }

    public se11(String str) {
        this(Pattern.compile(str));
    }

    public se11(Pattern pattern) {
        this.a = pattern;
    }
}
