package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class a96 implements acr0 {
    public static String i(Uri uri, String str) {
        Object next;
        String query = uri.getQuery();
        if (query != null) {
            Iterator it = ihc1.P0(query, new char[]{'&'}, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ihc1.h0((String) next, str, false));
            String str2 = (String) next;
            if (str2 != null) {
                return (String) o7h.C0(ihc1.P0(str2, new char[]{'='}, 6));
            }
        }
        return null;
    }

    public final Class b() {
        return z46.class;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String str;
        String string;
        String string2;
        chr0 chr0Var;
        psk pskVar;
        String string3;
        Object next;
        Uri data = intent.getData();
        Object obj = null;
        if (data == null || (string = i(data, "uri")) == null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string4 = extras.getString("uri");
                str = string4;
            } else {
                str = null;
            }
        } else {
            str = string4;
        }
        Uri data2 = intent.getData();
        if (data2 == null || (string = i(data2, "config")) == null) {
            Bundle extras2 = intent.getExtras();
            string = extras2 != null ? extras2.getString("config") : null;
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || (string2 = extras3.getString("errors")) == null) {
            string2 = "";
        }
        String str2 = string2;
        Bundle extras4 = intent.getExtras();
        String string5 = extras4 != null ? extras4.getString("initialPrompt") : null;
        Bundle extras5 = intent.getExtras();
        String string6 = extras5 != null ? extras5.getString("initialTitle") : null;
        Bundle extras6 = intent.getExtras();
        String string7 = extras6 != null ? extras6.getString("initialLocation") : null;
        Bundle extras7 = intent.getExtras();
        Integer numValueOf = extras7 != null ? extras7.containsKey("accentColor") ? Integer.valueOf(extras7.getInt("accentColor")) : null : null;
        Bundle extras8 = intent.getExtras();
        if (extras8 == null || (string3 = extras8.getString("pageType")) == null) {
            chr0Var = null;
        } else {
            Iterator it = chr0.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((chr0) next).name(), string3));
            chr0Var = (chr0) next;
        }
        if (chr0Var != chr0.c) {
            return new z86(str, th61Var.a, f(), h(str, string), str2, string5, string6, string7, numValueOf);
        }
        if (string != null) {
            String upperCase = string.toUpperCase(Locale.ROOT);
            for (Object obj2 : psk.e) {
                if (u890.j(((psk) obj2).name(), upperCase)) {
                    obj = obj2;
                    break;
                }
            }
            pskVar = (psk) obj;
            if (pskVar == null) {
                pskVar = psk.c;
            }
        } else {
            pskVar = psk.c;
        }
        return new z86(str, th61Var.a, chr0Var, pskVar, str2, string5, string6, string7, numValueOf);
    }

    public chr0 f() {
        return chr0.b;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b6w0 d() {
        return new b6w0(false);
    }

    public psk h(String str, String str2) {
        psk pskVarValueOf;
        return (str2 == null || (pskVarValueOf = psk.valueOf(str2.toUpperCase(Locale.ROOT))) == null) ? psk.b : pskVarValueOf;
    }
}
