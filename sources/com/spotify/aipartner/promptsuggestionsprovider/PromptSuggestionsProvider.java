package com.spotify.aipartner.promptsuggestionsprovider;

import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p.eg;
import p.flo1;
import p.guo1;
import p.h4b1;
import p.hge0;
import p.hhg1;
import p.idd1;
import p.igu;
import p.llm;
import p.lyx0;
import p.myx0;
import p.pzm;
import p.q8p;
import p.qyx0;
import p.ryx0;
import p.smo1;
import p.syx0;
import p.szc;
import p.tyx0;
import p.u890;
import p.uyx0;
import p.v420;
import p.w420;
import p.ynb0;
import p.z6v0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/aipartner/promptsuggestionsprovider/PromptSuggestionsProvider;", "Lp/q8p;", "<init>", "()V", "src_main_java_com_spotify_aipartner_promptsuggestionsprovider-promptsuggestionsprovider"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class PromptSuggestionsProvider extends q8p {
    public ynb0 a;
    public ynb0 b;
    public ynb0 c;
    public Uri d;
    public final llm e = smo1.e(flo1.l(guo1.B(), igu.a));
    public final idd1 f = new idd1(new z6v0(this, (byte) 28));

    public static void a() {
        throw new UnsupportedOperationException("Prompt suggestions are read-only");
    }

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        a();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        int i = myx0.a;
        this.d = Uri.parse("content://" + providerInfo.authority + "/v1/prompt-suggestions");
        super/*android.content.ContentProvider*/.attachInfo(context, providerInfo);
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        a();
        throw null;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        a();
        throw null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        a();
        throw null;
    }

    public final String getType(Uri uri) {
        Uri uri2 = this.d;
        if (uri2 == null) {
            u890.C("contentUri");
            throw null;
        }
        if (uri.equals(uri2)) {
            return "vnd.android.cursor.dir/vnd.com.spotify.partnerai.prompt-suggestion";
        }
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        a();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e9 A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #0 {, blocks: (B:28:0x009b, B:30:0x00a6, B:33:0x00ab, B:35:0x00b1, B:40:0x00c8, B:42:0x00cc, B:47:0x00e3, B:48:0x00e8, B:49:0x00e9), top: B:89:0x009b }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        uyx0 syx0Var;
        ArrayList arrayList;
        ynb0 ynb0Var = this.a;
        if (ynb0Var == null) {
            u890.C("accessPolicy");
            throw null;
        }
        lyx0 lyx0Var = (lyx0) ynb0Var.get();
        String callingPackage = getCallingPackage();
        int callingUid = Binder.getCallingUid();
        if (callingPackage == null) {
            lyx0Var.getClass();
        } else if (lyx0Var.b.a(lyx0Var.a, new szc(callingPackage, callingUid, "com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider"))) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            Uri uri2 = this.d;
            if (uri2 == null) {
                u890.C("contentUri");
                throw null;
            }
            if (!uri.equals(uri2)) {
                Logger.d("Unsupported prompt suggestions URI: %s", new Object[]{uri});
                hhg1.n(h4b1.d(uri, "Unsupported prompt suggestions URI: "));
                return null;
            }
            Boolean bool = (Boolean) ((qyx0) this.f.getValue()).b.getValue();
            if (bool == null) {
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"text"}, 0);
                Bundle bundle = new Bundle();
                bundle.putBoolean("loading", true);
                matrixCursor.setExtras(bundle);
                return matrixCursor;
            }
            if (!bool.booleanValue()) {
                MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"text"}, 0);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("loading", false);
                bundle2.putString("error", "disabled");
                matrixCursor2.setExtras(bundle2);
                return matrixCursor2;
            }
            ynb0 ynb0Var2 = this.b;
            if (ynb0Var2 == null) {
                u890.C("repository");
                throw null;
            }
            hge0 hge0Var = (hge0) ynb0Var2.get();
            Uri uri3 = this.d;
            if (uri3 == null) {
                u890.C("contentUri");
                throw null;
            }
            w420 w420Var = (w420) hge0Var.a;
            synchronized (w420Var) {
                v420 v420VarC = w420Var.c(callingPackage);
                v420VarC.a();
                syx0Var = v420VarC.b;
                if (syx0Var == null) {
                    syx0Var = new syx0(UUID.randomUUID().toString());
                    v420VarC.b = syx0Var;
                    v420VarC.c(syx0Var);
                } else if (!(syx0Var instanceof syx0)) {
                    if (syx0Var instanceof tyx0) {
                        long jMillis = v420VarC.e.b.millis() - v420VarC.c;
                        if (jMillis < 0 || jMillis >= 3600000) {
                            syx0Var = new syx0(UUID.randomUUID().toString());
                            v420VarC.b = syx0Var;
                            v420VarC.c(syx0Var);
                        }
                    } else {
                        if (!(syx0Var instanceof ryx0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        long jMillis2 = v420VarC.e.b.millis() - v420VarC.c;
                        if (jMillis2 < 0 || jMillis2 >= 60000) {
                            syx0Var = new syx0(UUID.randomUUID().toString());
                            v420VarC.b = syx0Var;
                            v420VarC.c(syx0Var);
                        }
                    }
                }
            }
            boolean z = syx0Var instanceof syx0;
            if (z) {
                hge0Var.b.invoke(uri3, callingPackage, ((syx0) syx0Var).a);
            }
            if (syx0Var instanceof tyx0) {
                arrayList = ((tyx0) syx0Var).a;
            } else {
                if (!z && !(syx0Var instanceof ryx0)) {
                    eg.o();
                    return null;
                }
                arrayList = z6x.a;
            }
            MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{"text"}, arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                matrixCursor3.addRow(new String[]{(String) it.next()});
            }
            Bundle bundleG = pzm.g("loading", z);
            if (syx0Var instanceof ryx0) {
                bundleG.putString("error", ((ryx0) syx0Var).a);
            }
            matrixCursor3.setExtras(bundleG);
            return matrixCursor3;
        }
        throw new SecurityException("Caller is not allowed to access prompt suggestions");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        a();
        throw null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return query(uri, strArr, str, strArr2, str2, null);
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return query(uri, strArr, null, null, null, cancellationSignal);
    }
}
