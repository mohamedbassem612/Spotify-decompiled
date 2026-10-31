package p;

import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a4x {
    public static final Object i = new Object();
    public static volatile a4x j;
    public final ReentrantReadWriteLock a;
    public final d46 b;
    public volatile byte c;
    public final v3x d;
    public final z3x e;
    public final ulc f;
    public final boolean g;
    public final i0s h;

    public a4x(c4x c4xVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        z3x z3xVar = (z3x) c4xVar.b;
        this.e = z3xVar;
        boolean z = c4xVar.a;
        this.g = z;
        this.h = (i0s) c4xVar.c;
        this.b = new d46(0);
        this.f = new ulc((byte) 8);
        v3x v3xVar = new v3x(this);
        this.d = v3xVar;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                z3xVar.a(new u3x(v3xVar));
            } catch (Throwable th2) {
                g(th2);
            }
        }
    }

    public static a4x a() {
        a4x a4xVar;
        synchronized (i) {
            a4xVar = j;
            o0c.q("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", a4xVar != null);
        }
        return a4xVar;
    }

    public static boolean d() {
        return j != null;
    }

    public final int b(int i2, CharSequence charSequence) {
        o0c.q("Not initialized yet", e());
        o0c.p(charSequence, "charSequence cannot be null");
        return this.d.a.m(i2, charSequence);
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final boolean e() {
        return c() == 1;
    }

    public final void f() {
        o0c.q("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.g);
        if (e()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            v3x v3xVar = this.d;
            a4x a4xVar = v3xVar.c;
            try {
                a4xVar.e.a(new u3x(v3xVar));
            } catch (Throwable th) {
                a4xVar.g(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void g(Throwable th) {
        d46 d46Var = this.b;
        ArrayList arrayList = new ArrayList(d46Var.c);
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(d46Var);
            d46Var.clear();
            this.a.writeLock().unlock();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((y3x) arrayList.get(i2)).a(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence h(int i2, int i3, int i4, CharSequence charSequence) {
        o0c.q("Not initialized yet", e());
        if (i2 < 0) {
            hhg1.n("start cannot be negative");
            return null;
        }
        if (i3 < 0) {
            hhg1.n("end cannot be negative");
            return null;
        }
        o0c.k("start should be <= than end", i2 <= i3);
        if (charSequence == null) {
            return null;
        }
        o0c.k("start should be < than charSequence length", i2 <= charSequence.length());
        o0c.k("end should be < than charSequence length", i3 <= charSequence.length());
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.d.a.r(charSequence, i2, i3, i4 == 1);
    }

    public final void i(tho1 tho1Var) {
        Handler handlerB = j2h1.B();
        Objects.requireNonNull(handlerB);
        y3x y3xVar = new y3x(new zrk(handlerB, (byte) 0), tho1Var);
        this.a.writeLock().lock();
        try {
            if (this.c == 1) {
                y3xVar.b();
            } else if (this.c == 2) {
                y3xVar.a(new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."));
            } else {
                this.b.add(y3xVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void j(EditorInfo editorInfo) {
        if (!e() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        v3x v3xVar = this.d;
        v3xVar.getClass();
        Bundle bundle = editorInfo.extras;
        rkj0 rkj0Var = (rkj0) v3xVar.b.b;
        int iA = rkj0Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? rkj0Var.b.getInt(iA + rkj0Var.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
