package com.google.android.gms.common.api;

import android.text.TextUtils;
import java.util.ArrayList;
import p.gi5;
import p.lal;
import p.t980;
import p.y36;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class AvailabilityException extends Exception {
    public final y36 a;

    public AvailabilityException(y36 y36Var) {
        this.a = y36Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        y36 y36Var = this.a;
        t980 it = y36Var.keySet().iterator();
        boolean z = true;
        while (true) {
            t980 t980Var = it;
            if (!t980Var.hasNext()) {
                break;
            }
            gi5 gi5Var = (gi5) t980Var.next();
            lal lalVar = (lal) y36Var.get(gi5Var);
            zod.s(lalVar);
            z &= !lalVar.j();
            String str = (String) gi5Var.b.c;
            String strValueOf = String.valueOf(lalVar);
            StringBuilder sb = new StringBuilder(str.length() + 2 + strValueOf.length());
            sb.append(str);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
