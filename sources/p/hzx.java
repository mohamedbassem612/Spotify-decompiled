package p;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hzx implements SharedPreferences {
    public final SharedPreferences a;
    public final ArrayList b = new ArrayList();
    public final String c;
    public final s82 d;
    public final tot e;

    public hzx(String str, SharedPreferences sharedPreferences, s82 s82Var, tot totVar) {
        this.c = str;
        this.a = sharedPreferences;
        this.d = s82Var;
        this.e = totVar;
    }

    public static hzx a(Context context, String str, jm jmVar, fzx fzxVar, gzx gzxVar) {
        String str2 = jmVar.b;
        int i = uot.a;
        d92.X();
        vf11.g(new wot());
        t82.a();
        Context applicationContext = context.getApplicationContext();
        cp31 cp31Var = new cp31();
        cp31Var.P(fzxVar.a);
        cp31Var.R(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        cp31Var.Q("android-keystore://" + str2);
        eea0 eea0VarC = cp31Var.s().c();
        cp31 cp31Var2 = new cp31();
        cp31Var2.P(gzxVar.a);
        cp31Var2.R(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        cp31Var2.Q("android-keystore://" + str2);
        eea0 eea0VarC2 = cp31Var2.s().c();
        return new hzx(str, applicationContext.getSharedPreferences(str, 0), (s82) eea0VarC2.f(s82.class), (tot) eea0VarC.f(tot.class));
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return p9a.b(this.e.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e) {
            jah.k("Could not encrypt key. ", e.getMessage(), e);
            return null;
        }
    }

    public final Object c(String str) {
        if (d(str)) {
            throw new SecurityException(f4i1.e(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.a.getString(strB, null);
            if (string != null) {
                byte[] bArrA = p9a.a(string);
                s82 s82Var = this.d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(s82Var.b(bArrA, strB.getBytes(charset)));
                byteBufferWrap.position(0);
                int iC = l1d.C(rjx.a(byteBufferWrap.getInt()));
                if (iC == 0) {
                    int i = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else if (iC == 1) {
                    d46 d46Var = new d46(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i2 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i2);
                        byteBufferWrap.position(byteBufferWrap.position() + i2);
                        d46Var.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (d46Var.c != 1 || !"__NULL__".equals(d46Var.b[0])) {
                        return d46Var;
                    }
                } else {
                    if (iC == 2) {
                        return Integer.valueOf(byteBufferWrap.getInt());
                    }
                    if (iC == 3) {
                        return Long.valueOf(byteBufferWrap.getLong());
                    }
                    if (iC == 4) {
                        return Float.valueOf(byteBufferWrap.getFloat());
                    }
                    if (iC == 5) {
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            jah.k("Could not decrypt value. ", e.getMessage(), e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            throw new SecurityException(f4i1.e(str, " is a reserved key for the encryption keyset."));
        }
        return this.a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new ezx(this, this.a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.e.b(p9a.a(entry.getKey()), this.c.getBytes()), StandardCharsets.UTF_8);
                    String str2 = str.equals("__NULL__") ? null : str;
                    map.put(str2, c(str2));
                } catch (GeneralSecurityException e) {
                    jah.k("Could not decrypt key. ", e.getMessage(), e);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Boolean)) ? z : ((Boolean) objC).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Float)) ? f : ((Float) objC).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Integer)) ? i : ((Integer) objC).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Long)) ? j : ((Long) objC).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof String)) ? str2 : (String) objC;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objC = c(str);
        Set d46Var = objC instanceof Set ? (Set) objC : new d46(0);
        return d46Var.size() > 0 ? d46Var : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
