package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.spotifyuserprofile.v0.CreateNoteRequest;
import com.spotify.spotifyuserprofile.v0.CreateNoteResponse;
import com.spotify.spotifyuserprofile.v0.DeleteNoteResponse;
import com.spotify.spotifyuserprofile.v0.Note;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m7o0 {
    public final zho0 a;
    public final yqg b;
    public final dt71 c;
    public final ve01 d;

    public m7o0(zho0 zho0Var, yqg yqgVar) {
        this.a = zho0Var;
        this.b = yqgVar;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.c = dt71VarE;
        this.d = d5p1.g(dt71VarE);
    }

    public static sw10 c(Exception exc, iu30 iu30Var) {
        if ((exc instanceof UnknownHostException) || (exc instanceof SocketTimeoutException) || (exc instanceof SocketException) || (exc instanceof IOException)) {
            return new sw10((String) null, 2);
        }
        return new sw10(exc instanceof HttpException ? (String) iu30Var.invoke(exc) : null, 1);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(String str, String str2, onm onmVar) {
        i7o0 i7o0Var;
        String str3;
        int i;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (onmVar instanceof i7o0) {
            i7o0Var = (i7o0) onmVar;
            int i2 = i7o0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i7o0Var.h = i2 - Integer.MIN_VALUE;
            } else {
                i7o0Var = new i7o0(this, onmVar);
            }
        } else {
            i7o0Var = new i7o0(this, onmVar);
        }
        Object objB = i7o0Var.f;
        int i3 = i7o0Var.h;
        boolean z = true;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i3 == 0) {
                    hm5.M(objB);
                    bon bonVarN = CreateNoteRequest.n();
                    bonVarN.q(str5);
                    bonVarN.n(str6);
                    CreateNoteRequest createNoteRequest = (CreateNoteRequest) bonVarN.build();
                    zho0 zho0Var = this.a;
                    createNoteRequest.getClass();
                    i7o0Var.a = str5;
                    i7o0Var.b = str6;
                    i7o0Var.h = 1;
                    objB = zho0Var.b(createNoteRequest, i7o0Var);
                    if (objB == d9nVar) {
                    }
                    return d9nVar;
                }
                if (i3 == 1) {
                    str6 = i7o0Var.b;
                    str5 = i7o0Var.a;
                    hm5.M(objB);
                } else {
                    if (i3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = i7o0Var.e;
                    String str7 = i7o0Var.d;
                    str4 = i7o0Var.c;
                    String str8 = i7o0Var.a;
                    try {
                        hm5.M(objB);
                        str3 = str7;
                        str5 = str8;
                    } catch (Exception e) {
                        e = e;
                        str5 = str8;
                        Logger.e(e, l1d.m("Failed to add note for section: ", str5), new Object[0]);
                        return c(e, new j7o0(this, (byte) 0));
                    }
                }
                str4.getClass();
                if (i != 0) {
                    z = false;
                }
                return new tw10(new nw10(str4, z), str3);
                String str9 = str6;
                CreateNoteResponse createNoteResponse = (CreateNoteResponse) objB;
                String strP = createNoteResponse.p();
                String strQ = createNoteResponse.q();
                strQ.getClass();
                if (strQ.length() <= 0) {
                    strQ = null;
                }
                Note noteO = createNoteResponse.o();
                long jS = noteO.s() > 0 ? noteO.s() / 1000 : this.b.b() / 1000;
                boolean z2 = noteO.n() == gd.ACCEPTED;
                strP.getClass();
                ct10 ct10Var = new ct10(strP, str9, jS, noteO.r() == ksw0.PROCESSING, z2);
                boolean z3 = z2;
                dt71 dt71Var = this.c;
                ow10 ow10Var = new ow10(str5, ct10Var);
                i7o0Var.a = str5;
                i7o0Var.b = null;
                i7o0Var.c = strP;
                i7o0Var.d = strQ;
                i7o0Var.e = z3 ? 1 : 0;
                i7o0Var.h = 2;
                if (dt71Var.emit(ow10Var, i7o0Var) != d9nVar) {
                    str3 = strQ;
                    i = z3 ? 1 : 0;
                    str4 = strP;
                    str4.getClass();
                    if (i != 0) {
                        z = false;
                    }
                    return new tw10(new nw10(str4, z), str3);
                }
                return d9nVar;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        k7o0 k7o0Var;
        String str2;
        Exception e;
        String str3;
        if (onmVar instanceof k7o0) {
            k7o0Var = (k7o0) onmVar;
            int i = k7o0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7o0Var.e = i - Integer.MIN_VALUE;
            } else {
                k7o0Var = new k7o0(this, onmVar);
            }
        } else {
            k7o0Var = new k7o0(this, onmVar);
        }
        Object objC = k7o0Var.c;
        int i2 = k7o0Var.e;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objC);
                    zho0 zho0Var = this.a;
                    k7o0Var.a = str;
                    k7o0Var.e = 1;
                    objC = zho0Var.c(str, k7o0Var);
                    if (objC == d9nVar) {
                    }
                    return d9nVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = k7o0Var.b;
                    str2 = k7o0Var.a;
                    try {
                        hm5.M(objC);
                        return new tw10(rih1.a, str3);
                    } catch (Exception e2) {
                        e = e2;
                        Logger.e(e, l1d.m("Failed to delete note: ", str2), new Object[0]);
                        return c(e, new j7o0(this, (byte) 1));
                    }
                }
                str = k7o0Var.a;
                hm5.M(objC);
                String strO = ((DeleteNoteResponse) objC).o();
                strO.getClass();
                String str4 = strO.length() > 0 ? strO : null;
                dt71 dt71Var = this.c;
                pw10 pw10Var = new pw10(str);
                k7o0Var.a = str;
                k7o0Var.b = str4;
                k7o0Var.e = 2;
                if (dt71Var.emit(pw10Var, k7o0Var) != d9nVar) {
                    str2 = str;
                    str3 = str4;
                    return new tw10(rih1.a, str3);
                }
                return d9nVar;
            } catch (Exception e3) {
                str2 = str;
                e = e3;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        if (r2.emit(r11, r4) == r10) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r19, java.lang.String r20, p.onm r21) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m7o0.d(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }
}
