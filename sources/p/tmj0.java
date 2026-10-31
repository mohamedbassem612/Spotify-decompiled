package p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tmj0 {
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final String a;
    public final String b;
    public final List c;

    public tmj0(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static final CopyOnWriteArraySet a() {
        if (dhn.a.contains(tmj0.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            dhn.a(tmj0.class, th);
            return null;
        }
    }

    public final ArrayList b() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final String c() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }
}
