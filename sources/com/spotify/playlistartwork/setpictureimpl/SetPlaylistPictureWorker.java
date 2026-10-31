package com.spotify.playlistartwork.setpictureimpl;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.CoroutineDaggerWorker;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.a;
import com.spotify.playlistartwork.setpictureimpl.proto.RegisterPlaylistImageRequest;
import com.spotify.playlistartwork.setpictureimpl.proto.RegisterPlaylistImageResponse;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import p.af11;
import p.bd30;
import p.bmq0;
import p.cl61;
import p.d9n;
import p.dl61;
import p.e331;
import p.eg;
import p.el61;
import p.ewq;
import p.hl61;
import p.hm5;
import p.iyc0;
import p.k65;
import p.kt91;
import p.kw7;
import p.m231;
import p.mwl1;
import p.o0c;
import p.onm;
import p.os00;
import p.phc;
import p.py21;
import p.qd4;
import p.qj5;
import p.r080;
import p.r8i0;
import p.rih1;
import p.s3b1;
import p.s4b1;
import p.se11;
import p.t080;
import p.tn21;
import p.tvl1;
import p.u890;
import p.uc9;
import p.uic;
import p.upn1;
import p.v8d0;
import p.xyc0;
import p.z8d0;
import p.zmu0;
import p.zno1;
import p.zov0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/playlistartwork/setpictureimpl/SetPlaylistPictureWorker;", "Lcom/spotify/androidx/workmanager/CoroutineDaggerWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_playlistartwork_setpictureimpl-setpictureimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SetPlaylistPictureWorker extends CoroutineDaggerWorker {
    public final Context i;
    public iyc0 j;
    public kt91 k;
    public t080 l;
    public zmu0 m;
    public final NotificationManager n;

    public SetPlaylistPictureWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.i = context;
        this.n = (NotificationManager) context.getSystemService("notification");
    }

    @Override // com.spotify.androidx.workmanager.CoroutineDaggerWorker
    public final Object j(s3b1 s3b1Var) {
        bd30 bd30VarX = kw7.x(this.i, this.n);
        WorkerParameters workerParameters = ((z8d0) this).b;
        tvl1 tvl1Var = workerParameters.i;
        UUID uuid = workerParameters.a;
        qj5 qj5Var = tvl1Var.a.a;
        qd4 qd4Var = new qd4(tvl1Var, uuid, bd30VarX, ((z8d0) this).a, (byte) 8);
        byte b = 14;
        upn1.t(new k65(qj5Var, "setForegroundAsync", qd4Var, b));
        String strC = workerParameters.b.c("KEY_PLAYLIST_URI");
        ewq ewqVar = workerParameters.b;
        String strC2 = ewqVar.c("KEY_IMAGE_URI");
        boolean zA = ewqVar.a("KEY_SHOW_RETRY_SNACKBAR");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("KEY_IMAGE_URI", strC2);
        ewq ewqVar2 = new ewq(linkedHashMap);
        o0c.N(ewqVar2);
        mwl1 mwl1Var = workerParameters.h;
        upn1.t(new k65(mwl1Var.b.a, "updateProgress", new uc9(mwl1Var, workerParameters.a, ewqVar2, (byte) 12), b));
        return (strC == null || strC2 == null) ? new v8d0() : n(strC, Uri.parse(strC2), zA, s3b1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, String str2, onm onmVar) {
        cl61 cl61Var;
        RegisterPlaylistImageResponse m231Var;
        if (onmVar instanceof cl61) {
            cl61Var = (cl61) onmVar;
            int i = cl61Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                cl61Var.c = i - os00.INVALID_ID;
            } else {
                cl61Var = new cl61(this, onmVar);
            }
        } else {
            cl61Var = new cl61(this, onmVar);
        }
        Object objA = cl61Var.a;
        int i2 = cl61Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                zmu0 zmu0Var = this.m;
                if (zmu0Var == null) {
                    u890.C("playlistImageEndpoint");
                    throw null;
                }
                Set set = s4b1.f;
                String strH = uic.x(str).h();
                af11 af11VarN = RegisterPlaylistImageRequest.n();
                af11VarN.n(str2);
                RegisterPlaylistImageRequest registerPlaylistImageRequest = (RegisterPlaylistImageRequest) af11VarN.build();
                cl61Var.c = 1;
                objA = zmu0Var.a(strH, registerPlaylistImageRequest, cl61Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = (RegisterPlaylistImageResponse) objA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to register image", new Object[0]);
        }
        hm5.M(m231Var);
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, String str2, onm onmVar) {
        dl61 dl61Var;
        m231 m231Var;
        if (onmVar instanceof dl61) {
            dl61Var = (dl61) onmVar;
            int i = dl61Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                dl61Var.c = i - os00.INVALID_ID;
            } else {
                dl61Var = new dl61(this, onmVar);
            }
        } else {
            dl61Var = new dl61(this, onmVar);
        }
        Object objR = dl61Var.a;
        int i2 = dl61Var.c;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objR);
                xyc0 xyc0Var = this.j;
                if (xyc0Var == null) {
                    u890.C("listOperation");
                    throw null;
                }
                dl61Var.c = 1;
                a aVarN = ModificationRequest.Attributes.n();
                aVarN.s(str2);
                objR = xyc0Var.r(str, aVarN, dl61Var);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objR);
            }
            ((py21) objR).d();
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to set picture", new Object[0]);
        }
        hm5.M(m231Var);
        return m231Var2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, Uri uri, onm onmVar) {
        el61 el61Var;
        SetPlaylistPictureWorker setPlaylistPictureWorker;
        SetPlaylistPictureWorker setPlaylistPictureWorker2;
        String str2;
        SetPlaylistPictureWorker setPlaylistPictureWorker3;
        String str3;
        String strZ;
        if (onmVar instanceof el61) {
            el61Var = (el61) onmVar;
            int i = el61Var.g;
            if ((i & os00.INVALID_ID) != 0) {
                el61Var.g = i - os00.INVALID_ID;
            } else {
                el61Var = new el61(this, onmVar);
            }
        } else {
            el61Var = new el61(this, onmVar);
        }
        Object objO = el61Var.e;
        int i2 = el61Var.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            if (u890.j(Uri.EMPTY, uri)) {
                el61Var.a = null;
                el61Var.g = 1;
                if (l(str, "", el61Var) != d9nVar) {
                    return null;
                }
            } else {
                el61Var.a = str;
                el61Var.b = this;
                el61Var.c = this;
                el61Var.d = str;
                el61Var.g = 2;
                objO = o(uri, el61Var);
                if (objO != d9nVar) {
                    setPlaylistPictureWorker = this;
                    setPlaylistPictureWorker2 = setPlaylistPictureWorker;
                    str2 = str;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objO);
            return null;
        }
        if (i2 == 2) {
            str = el61Var.d;
            setPlaylistPictureWorker = el61Var.c;
            setPlaylistPictureWorker2 = (SetPlaylistPictureWorker) el61Var.b;
            str2 = el61Var.a;
            hm5.M(objO);
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = (String) el61Var.b;
                hm5.M(objO);
                return str4;
            }
            setPlaylistPictureWorker3 = (SetPlaylistPictureWorker) el61Var.b;
            str3 = el61Var.a;
            hm5.M(objO);
        }
        phc picture = ((RegisterPlaylistImageResponse) objO).getPicture();
        setPlaylistPictureWorker3.getClass();
        strZ = zno1.z(picture.t());
        el61Var.a = null;
        el61Var.b = strZ;
        el61Var.g = 4;
        if (l(str3, strZ, el61Var) != d9nVar) {
            return d9nVar;
        }
        return strZ;
        String str5 = ((r080) objO).a;
        el61Var.a = str2;
        el61Var.b = setPlaylistPictureWorker2;
        el61Var.c = null;
        el61Var.d = null;
        el61Var.g = 3;
        objO = setPlaylistPictureWorker.k(str, str5, el61Var);
        if (objO != d9nVar) {
            setPlaylistPictureWorker3 = setPlaylistPictureWorker2;
            str3 = str2;
            phc picture2 = ((RegisterPlaylistImageResponse) objO).getPicture();
            setPlaylistPictureWorker3.getClass();
            strZ = zno1.z(picture2.t());
            el61Var.a = null;
            el61Var.b = strZ;
            el61Var.g = 4;
            if (l(str3, strZ, el61Var) != d9nVar) {
                return strZ;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:13:0x002b, B:47:0x00ce, B:18:0x003e, B:42:0x00b5, B:44:0x00bd, B:50:0x00d3, B:39:0x009b), top: B:57:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:13:0x002b, B:47:0x00ce, B:18:0x003e, B:42:0x00b5, B:44:0x00bd, B:50:0x00d3, B:39:0x009b), top: B:57:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r15 == r7) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.String r12, android.net.Uri r13, boolean r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker.n(java.lang.String, android.net.Uri, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object o(Uri uri, onm onmVar) {
        hl61 hl61Var;
        r080 m231Var;
        r8i0 r8i0VarW;
        if (onmVar instanceof hl61) {
            hl61Var = (hl61) onmVar;
            int i = hl61Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                hl61Var.c = i - os00.INVALID_ID;
            } else {
                hl61Var = new hl61(this, onmVar);
            }
        } else {
            hl61Var = new hl61(this, onmVar);
        }
        Object objA = hl61Var.a;
        int i2 = hl61Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                ContentResolver contentResolver = this.i.getContentResolver();
                String type = contentResolver.getType(uri);
                if (type == null) {
                    type = "image/jpeg";
                }
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new IllegalArgumentException("Unable to open file descriptor for URI: " + uri);
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        byte[] bArrK = o0c.K(fileInputStream);
                        se11 se11Var = r8i0.e;
                        try {
                            r8i0VarW = bmq0.w(type);
                        } catch (IllegalArgumentException unused) {
                            r8i0VarW = null;
                        }
                        tn21 tn21VarD = zov0.d(6, r8i0VarW, bArrK);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        t080 t080Var = this.l;
                        if (t080Var == null) {
                            u890.C("imageUploadEndpoint");
                            throw null;
                        }
                        hl61Var.c = 1;
                        objA = t080Var.a(tn21VarD, hl61Var);
                        d9n d9nVar = d9n.a;
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(fileInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        u890.p(parcelFileDescriptorOpenFileDescriptor, th3);
                        throw th4;
                    }
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = (r080) objA;
        } catch (Throwable th5) {
            m231Var = new m231(th5);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to upload image", new Object[0]);
        }
        hm5.M(m231Var);
        return m231Var;
    }
}
