package com.spotify.bluejay.upload.impl.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.SpotifyCoroutineWorker;
import com.spotify.base.java.logging.Logger;
import com.spotify.bluejay.data.api.AttachmentUploadException;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p.bmq0;
import p.cwq;
import p.d9n;
import p.dk7;
import p.eg;
import p.el0;
import p.ewq;
import p.fl7;
import p.fxh1;
import p.gxh1;
import p.hm5;
import p.hxh1;
import p.lnm;
import p.mmr0;
import p.o9x0;
import p.onm;
import p.oqn1;
import p.r8i0;
import p.rc2;
import p.rn21;
import p.se11;
import p.sk7;
import p.tk7;
import p.v8d0;
import p.x8d0;
import p.xvh1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/spotify/bluejay/upload/impl/worker/AttachmentUploadWorker;", "Lcom/spotify/androidx/workmanager/SpotifyCoroutineWorker;", "Lp/dk7;", "attachmentApiClient", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Lp/dk7;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/jaq", "src_main_java_com_spotify_bluejay_upload_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class AttachmentUploadWorker extends SpotifyCoroutineWorker {
    public final dk7 i;

    public AttachmentUploadWorker(dk7 dk7Var, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.i = dk7Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:119:0x0202 A[Catch: all -> 0x0040, LOOP:2: B:117:0x01ff->B:119:0x0202, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003a, B:87:0x0171, B:90:0x018e, B:95:0x01a1, B:113:0x01cd, B:116:0x01ed, B:119:0x0202, B:120:0x0210, B:123:0x021d, B:126:0x026c, B:127:0x027a, B:130:0x0287), top: B:138:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x026c A[Catch: all -> 0x0040, LOOP:1: B:124:0x0269->B:126:0x026c, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003a, B:87:0x0171, B:90:0x018e, B:95:0x01a1, B:113:0x01cd, B:116:0x01ed, B:119:0x0202, B:120:0x0210, B:123:0x021d, B:126:0x026c, B:127:0x027a, B:130:0x0287), top: B:138:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x018e A[Catch: all -> 0x0040, CancellationException -> 0x004b, Exception -> 0x019c, AttachmentUploadException -> 0x019e, LOOP:0: B:88:0x018b->B:90:0x018e, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003a, B:87:0x0171, B:90:0x018e, B:95:0x01a1, B:113:0x01cd, B:116:0x01ed, B:119:0x0202, B:120:0x0210, B:123:0x021d, B:126:0x026c, B:127:0x027a, B:130:0x0287), top: B:138:0x0032 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v16, types: [int] */
    /* JADX WARN: Type inference failed for: r15v17, types: [int] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.spotify.bluejay.upload.impl.worker.AttachmentUploadWorker, java.lang.Object, p.z8d0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.StringBuilder] */
    public final Object i(lnm lnmVar) throws Throwable {
        fl7 fl7Var;
        File file;
        ?? r2;
        ?? r3;
        int i;
        int i2;
        sk7 tk7Var;
        int i3;
        String str;
        String message;
        mmr0[] mmr0VarArr;
        cwq cwqVar;
        ?? r4;
        mmr0[] mmr0VarArr2;
        cwq cwqVar2;
        ?? r5;
        mmr0[] mmr0VarArr3;
        cwq cwqVar3;
        int i4;
        ?? r1 = this;
        if (lnmVar instanceof fl7) {
            fl7Var = (fl7) lnmVar;
            int i5 = fl7Var.e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fl7Var.e = i5 - Integer.MIN_VALUE;
            } else {
                fl7Var = new fl7((AttachmentUploadWorker) r1, (onm) lnmVar);
            }
        } else {
            fl7Var = new fl7((AttachmentUploadWorker) r1, (onm) lnmVar);
        }
        fl7 fl7Var2 = fl7Var;
        Object objM = fl7Var2.c;
        int i6 = fl7Var2.e;
        ?? r13 = 3;
        ?? r14 = 3;
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = fl7Var2.b;
                String str2 = fl7Var2.a;
                try {
                    try {
                        hm5.M(objM);
                        i3 = 0;
                        str = str2;
                        try {
                            mmr0VarArr3 = new mmr0[]{oqn1.n("attachment_id", ((xvh1) objM).a()), oqn1.n("file_name", str)};
                            cwqVar3 = new cwq();
                            for (i4 = i3; i4 < 2; i4++) {
                                mmr0 mmr0Var = mmr0VarArr3[i4];
                                cwqVar3.c(mmr0Var.b, (String) mmr0Var.a);
                            }
                            x8d0 x8d0Var = new x8d0(cwqVar3.a());
                            file.delete();
                            return x8d0Var;
                        } catch (AttachmentUploadException e) {
                            e = e;
                            r3 = str;
                            i2 = i3;
                            Logger.k("Upload failed for file=" + r3 + " reason=" + e.a + " serverMessage=" + e.b + " statusCode=" + e.c, new Object[i2]);
                            mmr0VarArr2 = new mmr0[]{oqn1.n("error_reason", e.a), oqn1.n("error_message", e.b), oqn1.n("file_name", (Object) r3)};
                            cwqVar2 = new cwq();
                            for (r5 = i2; r5 < 3; r5++) {
                                mmr0 mmr0Var2 = mmr0VarArr2[r5];
                                cwqVar2.c(mmr0Var2.b, (String) mmr0Var2.a);
                            }
                            v8d0 v8d0Var = new v8d0(cwqVar2.a());
                            file.delete();
                            return v8d0Var;
                        } catch (Exception e2) {
                            e = e2;
                            r2 = str;
                            i = i3;
                            Logger.l(e, "Upload failed for file=" + r2, new Object[i]);
                            mmr0 mmr0VarN = oqn1.n("error_reason", "");
                            message = e.getMessage();
                            if (message == null) {
                                message = "Upload failed";
                            }
                            mmr0VarArr = new mmr0[]{mmr0VarN, oqn1.n("error_message", message), oqn1.n("file_name", (Object) r2)};
                            cwqVar = new cwq();
                            for (r4 = i; r4 < 3; r4++) {
                                mmr0 mmr0Var3 = mmr0VarArr[r4];
                                cwqVar.c(mmr0Var3.b, (String) mmr0Var3.a);
                            }
                            v8d0 v8d0Var2 = new v8d0(cwqVar.a());
                            file.delete();
                            return v8d0Var2;
                        }
                    } catch (CancellationException e3) {
                        throw e3;
                    }
                } catch (AttachmentUploadException e4) {
                    e = e4;
                    i2 = 0;
                    r3 = str2;
                    Logger.k("Upload failed for file=" + r3 + " reason=" + e.a + " serverMessage=" + e.b + " statusCode=" + e.c, new Object[i2]);
                    mmr0VarArr2 = new mmr0[]{oqn1.n("error_reason", e.a), oqn1.n("error_message", e.b), oqn1.n("file_name", (Object) r3)};
                    cwqVar2 = new cwq();
                    while (r5 < 3) {
                        mmr0 mmr0Var4 = mmr0VarArr2[r5];
                        cwqVar2.c(mmr0Var4.b, (String) mmr0Var4.a);
                    }
                    v8d0 v8d0Var3 = new v8d0(cwqVar2.a());
                    file.delete();
                    return v8d0Var3;
                } catch (Exception e5) {
                    e = e5;
                    i = 0;
                    r2 = str2;
                    Logger.l(e, "Upload failed for file=" + r2, new Object[i]);
                    mmr0 mmr0VarN2 = oqn1.n("error_reason", "");
                    message = e.getMessage();
                    if (message == null) {
                        message = "Upload failed";
                    }
                    mmr0VarArr = new mmr0[]{mmr0VarN2, oqn1.n("error_message", message), oqn1.n("file_name", (Object) r2)};
                    cwqVar = new cwq();
                    while (r4 < 3) {
                        mmr0 mmr0Var5 = mmr0VarArr[r4];
                        cwqVar.c(mmr0Var5.b, (String) mmr0Var5.a);
                    }
                    v8d0 v8d0Var4 = new v8d0(cwqVar.a());
                    file.delete();
                    return v8d0Var4;
                }
            }
            hm5.M(objM);
            WorkerParameters workerParameters = r1.b;
            ewq ewqVar = workerParameters.b;
            ewq ewqVar2 = workerParameters.b;
            String strC = ewqVar.c("file_path");
            if (strC == null) {
                return new v8d0();
            }
            String strC2 = ewqVar2.c("content_type");
            if (strC2 == null) {
                return new v8d0();
            }
            String strC3 = ewqVar2.c("file_name");
            if (strC3 == null) {
                return new v8d0();
            }
            String strC4 = ewqVar2.c("file_type");
            if (strC4 == null) {
                strC4 = "";
            }
            hxh1 hxh1VarG = o9x0.g(strC4);
            if (hxh1VarG == null) {
                return new v8d0();
            }
            Object obj = Collections.unmodifiableMap(ewqVar2.a).get("page_count");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            Object obj2 = Collections.unmodifiableMap(ewqVar2.a).get("character_count");
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (strC2.length() == 0) {
                Logger.k("Could not determine content type for file=".concat(strC3), new Object[0]);
                mmr0[] mmr0VarArr4 = {oqn1.n("error_reason", "UNSUPPORTED_CONTENT_TYPE"), oqn1.n("error_message", "Could not determine file type"), oqn1.n("file_name", strC3)};
                cwq cwqVar4 = new cwq();
                for (int i7 = 0; i7 < 3; i7++) {
                    mmr0 mmr0Var6 = mmr0VarArr4[i7];
                    cwqVar4.c(mmr0Var6.b, (String) mmr0Var6.a);
                }
                return new v8d0(cwqVar4.a());
            }
            rn21 rn21Var = null;
            File file2 = new File(strC);
            if (!file2.exists() || file2.length() == 0) {
                Logger.k("File missing or empty: ".concat(strC), new Object[0]);
                mmr0[] mmr0VarArr5 = {oqn1.n("error_reason", ""), oqn1.n("error_message", "File not found"), oqn1.n("file_name", strC3)};
                cwq cwqVar5 = new cwq();
                for (int i8 = 0; i8 < 3; i8++) {
                    mmr0 mmr0Var7 = mmr0VarArr5[i8];
                    cwqVar5.c(mmr0Var7.b, (String) mmr0Var7.a);
                }
                return new v8d0(cwqVar5.a());
            }
            try {
                try {
                    se11 se11Var = r8i0.e;
                    try {
                        rn21Var = new rn21(bmq0.w(strC2), file2);
                        try {
                            if (hxh1VarG instanceof gxh1) {
                                try {
                                    tk7Var = new tk7(num, num2);
                                } catch (AttachmentUploadException e6) {
                                    e = e6;
                                    file = file2;
                                    r3 = strC3;
                                    i2 = 0;
                                    Logger.k("Upload failed for file=" + r3 + " reason=" + e.a + " serverMessage=" + e.b + " statusCode=" + e.c, new Object[i2]);
                                    mmr0VarArr2 = new mmr0[]{oqn1.n("error_reason", e.a), oqn1.n("error_message", e.b), oqn1.n("file_name", (Object) r3)};
                                    cwqVar2 = new cwq();
                                    while (r5 < 3) {
                                        mmr0 mmr0Var8 = mmr0VarArr2[r5];
                                        cwqVar2.c(mmr0Var8.b, (String) mmr0Var8.a);
                                    }
                                    v8d0 v8d0Var5 = new v8d0(cwqVar2.a());
                                    file.delete();
                                    return v8d0Var5;
                                } catch (Exception e7) {
                                    e = e7;
                                    file = file2;
                                    r2 = strC3;
                                    i = 0;
                                    Logger.l(e, "Upload failed for file=" + r2, new Object[i]);
                                    mmr0 mmr0VarN3 = oqn1.n("error_reason", "");
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "Upload failed";
                                    }
                                    mmr0VarArr = new mmr0[]{mmr0VarN3, oqn1.n("error_message", message), oqn1.n("file_name", (Object) r2)};
                                    cwqVar = new cwq();
                                    while (r4 < 3) {
                                        mmr0 mmr0Var9 = mmr0VarArr[r4];
                                        cwqVar.c(mmr0Var9.b, (String) mmr0Var9.a);
                                    }
                                    v8d0 v8d0Var6 = new v8d0(cwqVar.a());
                                    file.delete();
                                    return v8d0Var6;
                                }
                            } else {
                                if (!(hxh1VarG instanceof fxh1)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tk7Var = sk7.a;
                            }
                            i3 = 0;
                            el0 el0Var = new el0((Object) r1, strC2, file2, rn21Var, tk7Var, (lnm) null, (byte) 6);
                            fl7Var2.a = strC3;
                            fl7Var2.b = file2;
                            fl7Var2.e = 1;
                            objM = rc2.M(300000L, el0Var, fl7Var2);
                            d9n d9nVar = d9n.a;
                            if (objM == d9nVar) {
                                return d9nVar;
                            }
                            file = file2;
                            str = strC3;
                            mmr0VarArr3 = new mmr0[]{oqn1.n("attachment_id", ((xvh1) objM).a()), oqn1.n("file_name", str)};
                            cwqVar3 = new cwq();
                            while (i4 < 2) {
                                mmr0 mmr0Var10 = mmr0VarArr3[i4];
                                cwqVar3.c(mmr0Var10.b, (String) mmr0Var10.a);
                            }
                            x8d0 x8d0Var2 = new x8d0(cwqVar3.a());
                            file.delete();
                            return x8d0Var2;
                        } catch (AttachmentUploadException e8) {
                            e = e8;
                            file = file2;
                            r3 = r14;
                            i2 = rn21Var;
                            Logger.k("Upload failed for file=" + r3 + " reason=" + e.a + " serverMessage=" + e.b + " statusCode=" + e.c, new Object[i2]);
                            mmr0VarArr2 = new mmr0[]{oqn1.n("error_reason", e.a), oqn1.n("error_message", e.b), oqn1.n("file_name", (Object) r3)};
                            cwqVar2 = new cwq();
                            while (r5 < 3) {
                                mmr0 mmr0Var11 = mmr0VarArr2[r5];
                                cwqVar2.c(mmr0Var11.b, (String) mmr0Var11.a);
                            }
                            v8d0 v8d0Var7 = new v8d0(cwqVar2.a());
                            file.delete();
                            return v8d0Var7;
                        } catch (Exception e9) {
                            e = e9;
                            file = file2;
                            r2 = r13;
                            i = rn21Var;
                            Logger.l(e, "Upload failed for file=" + r2, new Object[i]);
                            mmr0 mmr0VarN4 = oqn1.n("error_reason", "");
                            message = e.getMessage();
                            if (message == null) {
                                message = "Upload failed";
                            }
                            mmr0VarArr = new mmr0[]{mmr0VarN4, oqn1.n("error_message", message), oqn1.n("file_name", (Object) r2)};
                            cwqVar = new cwq();
                            while (r4 < 3) {
                                mmr0 mmr0Var12 = mmr0VarArr[r4];
                                cwqVar.c(mmr0Var12.b, (String) mmr0Var12.a);
                            }
                            v8d0 v8d0Var8 = new v8d0(cwqVar.a());
                            file.delete();
                            return v8d0Var8;
                        }
                    } catch (AttachmentUploadException e10) {
                        e = e10;
                        r14 = strC3;
                        rn21Var = null;
                    } catch (Exception e11) {
                        e = e11;
                        r13 = strC3;
                        rn21Var = null;
                    }
                } catch (AttachmentUploadException e12) {
                    e = e12;
                    r14 = strC3;
                } catch (Exception e13) {
                    e = e13;
                    r13 = strC3;
                }
            } catch (CancellationException e14) {
                throw e14;
            } catch (Throwable th) {
                th = th;
                r1 = file2;
                r1.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
