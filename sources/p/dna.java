package p;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dna implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ena b;
    public final /* synthetic */ String c;

    public /* synthetic */ dna(ena enaVar, String str, byte b) {
        this.a = b;
        this.b = enaVar;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a A[Catch: ExoPlaybackException -> 0x0165, TryCatch #1 {ExoPlaybackException -> 0x0165, blocks: (B:45:0x0101, B:47:0x011a, B:51:0x0123, B:52:0x0129, B:54:0x0131, B:56:0x0135, B:58:0x0142, B:60:0x014a, B:57:0x013b), top: B:93:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131 A[Catch: ExoPlaybackException -> 0x0165, TryCatch #1 {ExoPlaybackException -> 0x0165, blocks: (B:45:0x0101, B:47:0x011a, B:51:0x0123, B:52:0x0129, B:54:0x0131, B:56:0x0135, B:58:0x0142, B:60:0x014a, B:57:0x013b), top: B:93:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135 A[Catch: ExoPlaybackException -> 0x0165, TryCatch #1 {ExoPlaybackException -> 0x0165, blocks: (B:45:0x0101, B:47:0x011a, B:51:0x0123, B:52:0x0129, B:54:0x0131, B:56:0x0135, B:58:0x0142, B:60:0x014a, B:57:0x013b), top: B:93:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013b A[Catch: ExoPlaybackException -> 0x0165, TryCatch #1 {ExoPlaybackException -> 0x0165, blocks: (B:45:0x0101, B:47:0x011a, B:51:0x0123, B:52:0x0129, B:54:0x0131, B:56:0x0135, B:58:0x0142, B:60:0x014a, B:57:0x013b), top: B:93:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014a A[Catch: ExoPlaybackException -> 0x0165, TRY_LEAVE, TryCatch #1 {ExoPlaybackException -> 0x0165, blocks: (B:45:0x0101, B:47:0x011a, B:51:0x0123, B:52:0x0129, B:54:0x0131, B:56:0x0135, B:58:0x0142, B:60:0x014a, B:57:0x013b), top: B:93:0x0101 }] */
    public final void accept(Object obj) {
        nv7 nv7Var;
        String[] strArr;
        yws ywsVar;
        int i;
        int iC;
        int i2;
        zws zwsVar;
        int i3;
        byte b;
        boolean z;
        byte b2 = this.a;
        String str = null;
        Object obj2 = null;
        str = null;
        str = null;
        String str2 = this.c;
        ena enaVar = this.b;
        switch (b2) {
            case 0:
                upa0 upa0VarS = rqt0.s((rwu) obj);
                t390 t390Var = enaVar.g;
                kqg0 kqg0Var = (kqg0) o7h.s0((List) upa0VarS.b);
                if (kqg0Var != null) {
                    int i4 = kqg0Var.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (kqg0Var.b[i5] == 2) {
                            qnf1 qnf1Var = kqg0Var.c[i5];
                            if (qnf1Var.a > 0) {
                                ie30 ie30Var = qnf1Var.a(0).d[0];
                                String str3 = ie30Var.l;
                                str = str3 == null ? ie30Var.f66p : str3;
                            }
                        }
                    }
                }
                t390Var.a.b();
                Map.Entry entryA = t390Var.a(str2);
                if (entryA != null) {
                    Iterator it = ((List) entryA.getValue()).iterator();
                    while (it.hasNext()) {
                        ((vma) it.next()).b(str);
                    }
                }
                ((tna) enaVar.i.getValue()).a(str2, upa0VarS);
                break;
            case 1:
                rwu rwuVar = (rwu) obj;
                qwu qwuVar = rwuVar.a;
                upa0 upa0VarS2 = rqt0.s(rwuVar);
                ArrayList arrayListF = upa0VarS2.f();
                if (!arrayListF.isEmpty()) {
                    ArrayList arrayList = new ArrayList(q7h.U(arrayListF, 10));
                    Iterator it2 = arrayListF.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((hpc1) it2.next()).h);
                    }
                    String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                    String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
                    qwuVar.getClass();
                    try {
                        qwuVar.b();
                        zws zwsVar2 = qwu.f123p;
                        zwsVar2.getClass();
                        yws ywsVar2 = new yws(zwsVar2);
                        ywsVar2.D = false;
                        ywsVar2.G = true;
                        for (jca jcaVar : qwuVar.e.b()) {
                            byte b3 = jcaVar.b;
                            ywsVar2.i(b3, b3 != 3);
                        }
                        int iC2 = qwuVar.c();
                        for (String str4 : strArr4) {
                            if (str4 == null) {
                                ywsVar2.h(new String[0]);
                            } else {
                                ywsVar2.h(new String[]{str4});
                            }
                            zws zwsVar3 = new zws(ywsVar2);
                            for (int i6 = 0; i6 < iC2; i6++) {
                                qwuVar.a(i6, zwsVar3);
                            }
                        }
                    } catch (ExoPlaybackException e) {
                        bhn0.p(e);
                        return;
                    }
                }
                List listE = upa0VarS2.e();
                if (!listE.isEmpty()) {
                    for (Object obj3 : listE) {
                        if (((nv7) obj3).b) {
                            obj2 = obj3;
                            nv7Var = (nv7) obj2;
                            if (nv7Var != null) {
                                strArr = (String[]) Arrays.copyOf(new String[]{nv7Var.a.toLanguageTag()}, 1);
                                qwuVar.getClass();
                                try {
                                    qwuVar.b();
                                    zws zwsVar4 = qwu.f123p;
                                    zwsVar4.getClass();
                                    ywsVar = new yws(zwsVar4);
                                    ywsVar.G = true;
                                    for (jca jcaVar2 : qwuVar.e.b()) {
                                        b = jcaVar2.b;
                                        if (b != 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        ywsVar.i(b, z);
                                    }
                                    iC = qwuVar.c();
                                    for (String str5 : strArr) {
                                        if (str5 == null) {
                                            ywsVar.g(new String[0]);
                                        } else {
                                            ywsVar.g(new String[]{str5});
                                        }
                                        zwsVar = new zws(ywsVar);
                                        for (i3 = 0; i3 < iC; i3++) {
                                            qwuVar.a(i3, zwsVar);
                                        }
                                    }
                                } catch (ExoPlaybackException e2) {
                                    bhn0.p(e2);
                                    return;
                                }
                            }
                        }
                    }
                    nv7Var = (nv7) obj2;
                    if (nv7Var != null) {
                        strArr = (String[]) Arrays.copyOf(new String[]{nv7Var.a.toLanguageTag()}, 1);
                        qwuVar.getClass();
                        qwuVar.b();
                        zws zwsVar5 = qwu.f123p;
                        zwsVar5.getClass();
                        ywsVar = new yws(zwsVar5);
                        ywsVar.G = true;
                        while (i < r6) {
                            b = jcaVar2.b;
                            if (b != 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ywsVar.i(b, z);
                        }
                        iC = qwuVar.c();
                        while (i2 < r6) {
                            if (str5 == null) {
                                ywsVar.g(new String[0]);
                            } else {
                                ywsVar.g(new String[]{str5});
                            }
                            zwsVar = new zws(ywsVar);
                            while (i3 < iC) {
                                qwuVar.a(i3, zwsVar);
                            }
                        }
                    }
                }
                new Handler(Looper.getMainLooper()).post(new uu1(rwuVar, str2, enaVar, (byte) 3));
                break;
            default:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Could not initiate download!", new Object[0]);
                enaVar.g.b(str2, 0L, s9p1.G(th, str2, 0L));
                break;
        }
    }
}
