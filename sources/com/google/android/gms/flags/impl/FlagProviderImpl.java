package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import p.mxn1;
import p.nho1;
import p.qfp0;
import p.u890;
import p.vh70;
import p.wra;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class FlagProviderImpl extends mxn1 {
    public boolean a;
    public SharedPreferences l;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // p.t1o1
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.l;
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            boolValueOf = (Boolean) u890.K(new wra(sharedPreferences, str, boolValueOf, (byte) 11));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            if (strValueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(strValueOf);
            }
        }
        return boolValueOf.booleanValue();
    }

    @Override // p.t1o1
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.l;
        Integer numValueOf = Integer.valueOf(i);
        try {
            numValueOf = (Integer) u890.K(new wra(sharedPreferences, str, numValueOf, (byte) 12));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            if (strValueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(strValueOf);
            }
        }
        return numValueOf.intValue();
    }

    @Override // p.t1o1
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.l;
        Long lValueOf = Long.valueOf(j);
        try {
            lValueOf = (Long) u890.K(new wra(sharedPreferences, str, lValueOf, (byte) 15));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            if (strValueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(strValueOf);
            }
        }
        return lValueOf.longValue();
    }

    @Override // p.t1o1
    public String getStringFlagValue(String str, String str2, int i) {
        if (this.a) {
            try {
                return (String) u890.K(new wra(this.l, str, str2, (byte) 16));
            } catch (Exception e) {
                String strValueOf = String.valueOf(e.getMessage());
                if (strValueOf.length() != 0) {
                    "Flag value not available, returning default: ".concat(strValueOf);
                }
            }
        }
        return str2;
    }

    @Override // p.t1o1
    public void init(vh70 vh70Var) {
        Context context = (Context) qfp0.c1(vh70Var);
        if (this.a) {
            return;
        }
        try {
            this.l = nho1.K(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            if (strValueOf.length() != 0) {
                "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf);
            }
        }
    }
}
